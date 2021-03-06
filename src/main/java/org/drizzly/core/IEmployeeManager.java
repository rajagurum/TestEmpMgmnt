/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.drizzly.core;

import java.util.List;
import org.drizzly.interfaces.dto.IEmployee;
import org.drizzly.persistence.dto.DrMaEmployee;

/**
 *
 * @author rajaguru
 */
public interface IEmployeeManager {
    
    IEmployee getEmployeeDetails(Long emId);
    
    void saveEmployee(DrMaEmployee emp);
    
    void removeEmployee(Long emId);
    
    List<DrMaEmployee> getAllEmployees() ;
    
    void UpdateEmployee(DrMaEmployee emp);
}
