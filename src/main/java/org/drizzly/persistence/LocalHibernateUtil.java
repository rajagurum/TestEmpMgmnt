/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.drizzly.persistence;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.stereotype.Component;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author rajaguru
 */
@Component
public class LocalHibernateUtil {

    private static final SessionFactory sessionFactory;
    private static  final ServiceRegistry serviceRegistry;
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            Configuration config = new Configuration().configure(LocalHibernateUtil.class.getResource("/hibernate.cfg.xml"));
            StandardServiceRegistryBuilder serviceRegistryBuilder=new StandardServiceRegistryBuilder();
            serviceRegistryBuilder.applySettings(config.getProperties());
            serviceRegistry=serviceRegistryBuilder.build();
            sessionFactory=config.buildSessionFactory(serviceRegistry);
        } catch (Exception ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
