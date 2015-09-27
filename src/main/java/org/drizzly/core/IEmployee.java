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
interface IEmployee {

    public String getEmpName();

    public String getAddress();

    public String getCity();

    public String getState();

    public Long getEmpId();

    public Date getJoiningDate();

    public BigDecimal getSalary();

    void setAddress(String address);

    void setCity(String city);

    void setEmpId(Long EmpId);

    void setEmpName(String empName);

    void setJoiningDate(Date joiningDate);

    void setSalary(BigDecimal salary);

    void setState(String state);

    EmpLoanDetails getEmployeeLoadDetail();

    void setEmployeeLoadDetail(EmpLoanDetails employeeLoadDetail);

}
