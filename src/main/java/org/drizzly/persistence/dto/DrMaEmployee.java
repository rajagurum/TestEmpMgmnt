package org.drizzly.persistence.dto;
// Generated 17 Oct, 2015 9:14:35 PM by Hibernate Tools 4.3.1


import org.drizzly.interfaces.dto.IEmployee;
import java.math.BigInteger;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * DrMaEmployee generated by hbm2java
 */
public class DrMaEmployee  implements java.io.Serializable, IEmployee {


     private Long emId;
     private String emName;
    // @DateTimeFormat(pattern = "MM/dd/yyyy")
     private Date emJoinDate;
     private BigInteger emSalary;
     //@DateTimeFormat(pattern = "MM/dd/yyyy")
     private Date emReleivedDate;
     private String emAddress;
     private String emCity;
     private String emState;
     private String emPincode;
     private String emCountry;
     private String emMobile1;
     private String emMobile2;
     private String emEmail1;
     private Set drTrLoanDues = new HashSet(0);
     private Set drTrLoans = new HashSet(0);

    public DrMaEmployee() {
    }

	
    public DrMaEmployee(String emName, Date emJoinDate, BigInteger emSalary, String emAddress, String emCity, String emState, String emPincode, String emCountry, String emMobile1) {
        this.emName = emName;
        this.emJoinDate = emJoinDate;
        this.emSalary = emSalary;
        this.emAddress = emAddress;
        this.emCity = emCity;
        this.emState = emState;
        this.emPincode = emPincode;
        this.emCountry = emCountry;
        this.emMobile1 = emMobile1;
    }
    public DrMaEmployee(String emName, Date emJoinDate, BigInteger emSalary, Date emReleivedDate, String emAddress, String emCity, String emState, String emPincode, String emCountry, String emMobile1, String emMobile2, String emEmail1, Set drTrLoanDues, Set drTrLoans) {
       this.emName = emName;
       this.emJoinDate = emJoinDate;
       this.emSalary = emSalary;
       this.emReleivedDate = emReleivedDate;
       this.emAddress = emAddress;
       this.emCity = emCity;
       this.emState = emState;
       this.emPincode = emPincode;
       this.emCountry = emCountry;
       this.emMobile1 = emMobile1;
       this.emMobile2 = emMobile2;
       this.emEmail1 = emEmail1;
       this.drTrLoanDues = drTrLoanDues;
       this.drTrLoans = drTrLoans;
    }
   
    public Long getEmId() {
        return this.emId;
    }
    
    public void setEmId(Long emId) {
        this.emId = emId;
    }
    @Override
    public String getEmName() {
        return this.emName;
    }
    
    public void setEmName(String emName) {
        this.emName = emName;
    }
    @Override
    public Date getEmJoinDate() {
        return this.emJoinDate;
    }
    
    public void setEmJoinDate(Date emJoinDate) {
        this.emJoinDate = emJoinDate;
    }
    public BigInteger getEmSalary() {
        return this.emSalary;
    }
    
    public void setEmSalary(BigInteger emSalary) {
        this.emSalary = emSalary;
    }
    public Date getEmReleivedDate() {
        return this.emReleivedDate;
    }
    
    public void setEmReleivedDate(Date emReleivedDate) {
        this.emReleivedDate = emReleivedDate;
    }
    @Override
    public String getEmAddress() {
        return this.emAddress;
    }
    
    public void setEmAddress(String emAddress) {
        this.emAddress = emAddress;
    }
    @Override
    public String getEmCity() {
        return this.emCity;
    }
    
    public void setEmCity(String emCity) {
        this.emCity = emCity;
    }
    @Override
    public String getEmState() {
        return this.emState;
    }
    
    public void setEmState(String emState) {
        this.emState = emState;
    }
    @Override
    public String getEmPincode() {
        return this.emPincode;
    }
    
    public void setEmPincode(String emPincode) {
        this.emPincode = emPincode;
    }
    @Override
    public String getEmCountry() {
        return this.emCountry;
    }
    
    public void setEmCountry(String emCountry) {
        this.emCountry = emCountry;
    }
    @Override
    public String getEmMobile1() {
        return this.emMobile1;
    }
    
    public void setEmMobile1(String emMobile1) {
        this.emMobile1 = emMobile1;
    }
    @Override
    public String getEmMobile2() {
        return this.emMobile2;
    }
    
    public void setEmMobile2(String emMobile2) {
        this.emMobile2 = emMobile2;
    }
    @Override
    public String getEmEmail1() {
        return this.emEmail1;
    }
    
    public void setEmEmail1(String emEmail1) {
        this.emEmail1 = emEmail1;
    }
    @Override
    public Set getDrTrLoanDues() {
        return this.drTrLoanDues;
    }
    
    public void setDrTrLoanDues(Set drTrLoanDues) {
        this.drTrLoanDues = drTrLoanDues;
    }
    @Override
    public Set getDrTrLoans() {
        return this.drTrLoans;
    }
    
    public void setDrTrLoans(Set drTrLoans) {
        this.drTrLoans = drTrLoans;
    }




}


