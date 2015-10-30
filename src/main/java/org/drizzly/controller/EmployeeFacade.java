/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.drizzly.controller;

import java.util.Map;
import org.drizzly.core.EmployeeManager;
import org.drizzly.interfaces.dto.IEmployee;
import org.drizzly.persistence.dto.DrMaEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author rajaguru
 */
@Configuration
public class EmployeeFacade  {
    @Autowired
    EmployeeManager manager;
    
    protected IEmployee findEmployee(final Long empId) {
        IEmployee iEmployee = manager.getEmployeeDetails(empId);
        return iEmployee;
    }
    
    protected String insertEmployee(final DrMaEmployee employee){
        System.out.println("Employee input details "+employee);
        manager.saveEmployee(employee);
        return "Succussfully Inserted";
    }
    
    protected String updateEmployee(final DrMaEmployee employee){
        final IEmployee iEmployee = findEmployee(employee.getEmId());
        System.out.println("existiEmployee  brfore update "+iEmployee);
        String message = "";
        if (iEmployee != null) {
            DrMaEmployee existiEmployee = (DrMaEmployee) iEmployee;
            existiEmployee.setEmAddress(employee.getEmAddress());
            existiEmployee.setEmName(employee.getEmName());
            existiEmployee.setEmMobile1(employee.getEmMobile1());
            existiEmployee.setEmMobile2(employee.getEmMobile2());
            existiEmployee.setEmPincode(employee.getEmPincode());
            //existiEmployee.setEmReleivedDate(employee.getEmReleivedDate());
            System.out.println("existiEmployee  "+existiEmployee);
            manager.UpdateEmployee(existiEmployee);
            message = employee.getEmName()+" succussfully updated";
        } else {
            message = "Update failed no such Employee";
        }
        return message;
    }
    
    protected String deleteEmployee(final Long empId){
        manager.removeEmployee(empId);
        return "Deleted "+empId;
    }
    
}
