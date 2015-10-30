/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.drizzly.persistence.dao;

import java.util.List;
import org.drizzly.interfaces.IStudentDAO;
import org.drizzly.persistence.dto.DrMaStudent;
import org.hibernate.Criteria;

/**
 *
 * @author rajaguru
 */
public class StudentDAO extends AbstractDao implements IStudentDAO{

    @Override
    public void saveEmployee(DrMaStudent student) {
        saveOrUpdate(student);
    }

    @Override
    public List<DrMaStudent> findAllStudents() {
        Criteria criteria = getSession().createCriteria(DrMaStudent.class);
        List<DrMaStudent> lst= criteria.list();
        getSession().close();
        return lst;
    }
    
    public void testSaveStudent(){
        System.out.print("testSaveEmployee");
        DrMaStudent student = new DrMaStudent();
        student.setStName("Mithun");
        //student.setDrMaCategory(null);
     }
}
