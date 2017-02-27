package com.girish.jung.dao.impl;

import com.girish.jung.dao.AbstractDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

/**
 * Created by girishjung on 25/02/2017.
 */
public class AbstractDaoImpl<T> implements AbstractDao<T> {

    @PersistenceContext
    protected EntityManager entityManager;

    public CriteriaBuilder getCriteriaBuilder() {
        return entityManager.getCriteriaBuilder();
    }

    public Integer save(T entity) {
        Session session = (Session) entityManager.getDelegate();
        return (Integer) session.save(entity);
    }

    public void persist(T entity) {
        entityManager.persist(entity);
    }

    public void delete(T entity) {
        entityManager.remove(entity);
    }

}
