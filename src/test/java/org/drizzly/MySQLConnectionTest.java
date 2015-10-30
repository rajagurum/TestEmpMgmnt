/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.drizzly;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.drizzly.core.EmployeeManager;
import org.drizzly.persistence.dao.EmployeeDAO;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

/**
 *
 * @author rajaguru
 */
public class MySQLConnectionTest {

    @SuppressWarnings("CallToPrintStackTrace")
    @Test
    public void testConnect() {
        String dbUrl = "jdbc:mysql://localhost:3306/DrizzlyDB";
        String dbClass = "com.mysql.jdbc.Driver";
        String query = "Select distinct(table_name) from INFORMATION_SCHEMA.TABLES";
        String username = "root";
        String password = "rajaguru";
        try {
            Class.forName(dbClass);
            try (Connection connection = DriverManager.getConnection(dbUrl, username, password)) {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
                while (resultSet.next()) {
                    String tableName = resultSet.getString(1);
                    System.out.println("Table name : " + tableName);
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void testGetAllEmployees() {
        ApplicationContext application=new AnnotationConfigApplicationContext(EmployeeManager.class);
        EmployeeManager emp=application.getBean(EmployeeManager.class);
        Long empId = new Long(1);
        EmployeeDAO dao = new EmployeeDAO();
        Assert.notEmpty(dao.findAllEmployees());
        
    }
    
    @Test
    public void testGetEmployeeById() {
        Long empId = new Long(1);
        EmployeeManager emp = new EmployeeManager();
        System.out.println(emp.getEmployeeDetails(Long.valueOf("1")));
        Assert.notNull(emp);
    }
}
