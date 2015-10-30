/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.drizzly;

import java.util.List;
import org.drizzly.persistence.dao.EmployeeDAO;
import org.drizzly.persistence.dao.StudentDAO;
import org.drizzly.persistence.dto.DrMaStudent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author rajaguru
 */
public class StudentTest {
    StudentDAO dAO;
    public StudentTest() {
        dAO = new StudentDAO();
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
    
//    @Test
//     public void testFindAllEmployees() {
//         List<DrMaStudent> students = dAO.findAllStudents();
//         for(DrMaStudent student : students){
//             System.out.println("Student Name ::  "+student.getStName());
//             System.out.println("Student MotherName ::  "+student.getStMotherName());
//         }
//     }
}
