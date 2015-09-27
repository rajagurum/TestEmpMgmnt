/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.drizzly.core;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author rajaguru
 */
class Employee implements IEmployee {

    private String empName, address, city, state;

    private Long EmpId;
    private Date joiningDate;
    private BigDecimal salary;
    private EmpLoanDetails employeeLoadDetail;

    public EmpLoanDetails getEmployeeLoadDetail() {
        return employeeLoadDetail;
    }

    public void setEmployeeLoadDetail(EmpLoanDetails employeeLoadDetail) {
        this.employeeLoadDetail = employeeLoadDetail;
    }
    
    

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setEmpId(Long EmpId) {
        this.EmpId = EmpId;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public Long getEmpId() {
        return EmpId;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public BigDecimal getSalary() {
        return salary;
    }

}
