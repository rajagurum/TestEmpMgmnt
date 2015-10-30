/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.drizzly.interfaces;

import java.util.List;
import org.drizzly.persistence.dto.DrMaStudent;

/**
 *
 * @author rajaguru
 */
public interface IStudentDAO {
    void saveEmployee(DrMaStudent student);
     
    List<DrMaStudent> findAllStudents();
     
}
