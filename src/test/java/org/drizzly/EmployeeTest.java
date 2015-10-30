/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.drizzly;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.util.List;
import org.drizzly.interfaces.dto.IEmployee;
import org.drizzly.persistence.dao.EmployeeDAO;
import org.drizzly.persistence.dto.DrMaEmployee;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rajaguru
 */
public class EmployeeTest {
    
    EmployeeDAO dAO;
    public EmployeeTest() {
        dAO = new EmployeeDAO();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testFindAllEmployees() {
         List<DrMaEmployee> employees = dAO.findAllEmployees();
         for(DrMaEmployee employee : employees){
             System.out.println("Emp Name ::  "+employee.getEmName());
             System.out.println("Emp Salary ::  "+employee.getEmSalary());
         }
     }
     @Test
     public void testSaveEmployee(){
         System.out.print("testSaveEmployee");
         DrMaEmployee employee = new DrMaEmployee();
         employee.setEmName("Rajaguru");
         employee.setEmJoinDate(new Date(1));
         employee.setEmSalary(BigInteger.valueOf(10000));
         employee.setEmEmail1("rajagurum@gmail.com");
         employee.setEmMobile1("9840676492");
         employee.setEmMobile2("9840676492");
         employee.setEmCity("Chennai");
         employee.setEmCountry("India");
         employee.setEmState("TamilNadu");
         employee.setEmAddress("Velachery");
         employee.setEmPincode("600042");
         employee.setEmReleivedDate(null);
         dAO.saveEmployee(employee);
     }
     @Test
     public void testDeleteEmployeeByEmId(){
         dAO.deleteEmployeeByEmId(13l);
     }
     @Test
     public void testfindByEmId(){
         IEmployee employee = dAO.findByEmId(1l);
         System.out.println("name "+ (employee != null ? employee.getEmName() : " Not found in DB"));
     }
}
