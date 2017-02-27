package com.girish.jung.dao.impl;

import com.girish.jung.dao.PlayerDao;
import com.girish.jung.model.Player;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 * Created by girishjung on 2/25/17.
 */
@Repository
public class PlayerDaoImpl extends AbstractDaoImpl<Player> implements PlayerDao {

    public Player findByName(String firstName, String lastName) {
        CriteriaBuilder criteriaBuilder = getCriteriaBuilder();
        CriteriaQuery<Player> criteriaQuery = criteriaBuilder.createQuery(Player.class);
        Root<Player> root = criteriaQuery.from(Player.class);
        criteriaQuery.select(root).where(
                criteriaBuilder.and(
                        criteriaBuilder.equal(root.get("firstName"), firstName),
                        criteriaBuilder.equal(root.get("lastName"), lastName)
                )
        );
        return entityManager.createQuery(criteriaQuery).getSingleResult();
    }

    public boolean isPlayerExistsByName(String firstName, String lastName) {
        return false;
    }

}
