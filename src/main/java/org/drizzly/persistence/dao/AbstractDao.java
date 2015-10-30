/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.drizzly.persistence.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.drizzly.persistence.LocalHibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author rajaguru
 */
abstract class AbstractDao {
    protected final Log logger = LogFactory.getLog(getClass());
    @Autowired
    LocalHibernateUtil hibernateUtil;
    
    private SessionFactory sessionFactory=hibernateUtil.getSessionFactory();
 
    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }
 
    public void persist(Object entity) {
        getSession().persist(entity);
    }
 
    public void delete(Object entity) {
        getSession().getTransaction().begin();
        //boolean isEmpExist = getSession().contains(entity);
        getSession().delete(entity);
        getSession().getTransaction().commit();
        getSession().close();
    }
    
    public void saveOrUpdate(Object entity){
        getSession().getTransaction().begin();
        if(!getSession().contains(entity)){
            getSession().saveOrUpdate(entity);
            getSession().flush();
        }
        getSession().getTransaction().commit();
        getSession().close();
    }
    
    public void update(Object entity){
        getSession().getTransaction().begin();
        if(!getSession().contains(entity)){
            getSession().update(entity);
            //getSession().flush();
        }
        getSession().getTransaction().commit();
        getSession().close();
    }
    
    public void save(Object entity){
        getSession().getTransaction().begin();
        if(!getSession().contains(entity)){
            getSession().save(entity);
            getSession().flush();
        }
        getSession().getTransaction().commit();
        getSession().close();
    }
}
