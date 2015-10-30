/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.drizzly.persistence.dao;

import java.util.List;
import javax.annotation.Resource;
import org.drizzly.interfaces.IEmployeeDAO;
import org.drizzly.interfaces.dto.IEmployee;
import org.drizzly.persistence.LocalHibernateUtil;
import org.drizzly.persistence.dto.DrMaEmployee;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author rajaguru
 */
@Configuration
public class EmployeeDAO extends AbstractDao implements IEmployeeDAO{
   final SessionFactory sessionFactory=LocalHibernateUtil.getSessionFactory();
   
    public void saveoOrUpdateEmployee(DrMaEmployee employee) {
        saveOrUpdate(employee);
    }
 
    @SuppressWarnings("unchecked")
    public List<DrMaEmployee> findAllEmployees() {
        Criteria criteria = getSession().createCriteria(DrMaEmployee.class);
        List<DrMaEmployee> lst= criteria.list();
        getSession().close();
        return lst;
    }
 
    public void deleteEmployeeByEmId(Long emId) {
        if(findByEmId(emId) != null){
            System.out.print("inside delete ");
            getSession().beginTransaction();
            Query query = getSession().createSQLQuery("delete from DR_MA_EMPLOYEE where em_Id = :emId");
            query.setLong("emId",emId);
            query.executeUpdate();
            getSession().getTransaction().commit();
            getSession().close();
        }
    }
 
     
    public IEmployee findByEmId(Long emId){
        System.out.print("inside by findby ");
        getSession().beginTransaction();
        final Criteria criteria = getSession().createCriteria(DrMaEmployee.class);
        criteria.add(Restrictions.eq("emId",emId));
        System.out.print("inside by findby "+criteria.toString());
        DrMaEmployee emp=null;
        if(criteria.uniqueResult() != null){
            emp= (DrMaEmployee) criteria.uniqueResult();
        }
        getSession().close();
        return emp;
    }
     
    public void updateEmployee(DrMaEmployee employee){
        //update(employee);
        getSession().beginTransaction();
        Query query = getSession().createSQLQuery("update DR_MA_EMPLOYEE set EM_NAME=:emName, "
                + "EM_ADDRESS=:emAddress, EM_PINCODE=:emPincode, EM_MOBILE1=:emMobile1, EM_MOBILE2=:emMobile2, EM_EMAIL1=:emEmail1 "
                + "where EM_ID=:emId");
        query.setString("emName", employee.getEmName());
        query.setString("emAddress", employee.getEmAddress());
        query.setString("emPincode", employee.getEmPincode());
        query.setString("emMobile1", employee.getEmMobile1());
        query.setString("emMobile2", employee.getEmMobile2());
        query.setString("emEmail1", employee.getEmEmail1());
        query.setLong("emId", employee.getEmId());
        int result = query.executeUpdate();
        getSession().getTransaction().commit();
        System.out.println("result  "+result);
        getSession().close();
    }
    
    public void saveOrUpdateEmployee(DrMaEmployee employee){
        saveOrUpdate(employee);
    }
    
    public void saveEmployee(DrMaEmployee employee){
        save(employee);
    }
    
    public void persistEmployee(DrMaEmployee employee){
        persist(employee);
    }
}
