/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.drizzly.interfaces;

import java.util.List;
import org.drizzly.interfaces.dto.IEmployee;
import org.drizzly.persistence.dto.DrMaEmployee;

/**
 *
 * @author rajaguru
 */
public interface IEmployeeDAO {
    void saveEmployee(DrMaEmployee employee);
     
    List<DrMaEmployee> findAllEmployees();
     
    void deleteEmployeeByEmId(Long emId);
     
    IEmployee findByEmId(Long emId);
     
    void updateEmployee(DrMaEmployee employee);
}
