package com.girish.jung.dao.impl;

import com.girish.jung.dao.AbstractDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by pkanagaratnam on 25/02/2017.
 */
public class AbstractDaoImpl<T> implements AbstractDao<T> {
    @PersistenceContext
    private EntityManager entityManager;

    public void persist(T entity) {
        entityManager.persist(entity);
    }

    public void delete(T entity) {

        entityManager.remove(entity);
    }

}
