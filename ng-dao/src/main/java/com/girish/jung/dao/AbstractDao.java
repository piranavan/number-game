package com.girish.jung.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by girishjung on 25/02/2017.
 */
public interface AbstractDao<T> {

    public Integer save(T entity);

    public void persist(T entity);

    public void delete(T entity);
}
