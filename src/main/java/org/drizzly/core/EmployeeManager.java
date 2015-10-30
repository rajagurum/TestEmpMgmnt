/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.drizzly.core;

import java.util.List;
import org.drizzly.interfaces.IEmployeeDAO;
import org.drizzly.interfaces.dto.IEmployee;
import org.drizzly.persistence.dto.DrMaEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author rajaguru
 */
@Configuration
public class EmployeeManager implements IEmployeeManager{

    @Autowired
    private IEmployeeDAO employeeDao;
    
    @Override
    public IEmployee getEmployeeDetails(Long emId) {
        return (IEmployee) employeeDao.findByEmId(emId); 
    }
    
    @Override
    public void UpdateEmployee(DrMaEmployee emp) {
        employeeDao.updateEmployee(emp); 
    }

    @Override
    public void saveEmployee(DrMaEmployee emp) {
        employeeDao.saveEmployee(emp);
    }

    @Override
    public void removeEmployee(Long emId) {
        employeeDao.deleteEmployeeByEmId(emId);
    }

    @Override
    public List<DrMaEmployee> getAllEmployees() {
        return employeeDao.findAllEmployees();
    }

}
