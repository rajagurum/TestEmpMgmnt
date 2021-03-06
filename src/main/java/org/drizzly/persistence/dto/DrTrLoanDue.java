package org.drizzly.persistence.dto;
// Generated 17 Oct, 2015 9:14:35 PM by Hibernate Tools 4.3.1


import java.math.BigInteger;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * DrTrLoanDue generated by hbm2java
 */
public class DrTrLoanDue  implements java.io.Serializable {


     private Long lpId;
     private DrMaEmployee drMaEmployee;
     private DrTrLoanDue drTrLoanDue;
     private BigInteger lpAmountPaid;
     private Date lpDate;
     private Set drTrLoanDues = new HashSet(0);

    public DrTrLoanDue() {
    }

	
    public DrTrLoanDue(DrMaEmployee drMaEmployee, DrTrLoanDue drTrLoanDue, BigInteger lpAmountPaid, Date lpDate) {
        this.drMaEmployee = drMaEmployee;
        this.drTrLoanDue = drTrLoanDue;
        this.lpAmountPaid = lpAmountPaid;
        this.lpDate = lpDate;
    }
    public DrTrLoanDue(DrMaEmployee drMaEmployee, DrTrLoanDue drTrLoanDue, BigInteger lpAmountPaid, Date lpDate, Set drTrLoanDues) {
       this.drMaEmployee = drMaEmployee;
       this.drTrLoanDue = drTrLoanDue;
       this.lpAmountPaid = lpAmountPaid;
       this.lpDate = lpDate;
       this.drTrLoanDues = drTrLoanDues;
    }
   
    public Long getLpId() {
        return this.lpId;
    }
    
    public void setLpId(Long lpId) {
        this.lpId = lpId;
    }
    public DrMaEmployee getDrMaEmployee() {
        return this.drMaEmployee;
    }
    
    public void setDrMaEmployee(DrMaEmployee drMaEmployee) {
        this.drMaEmployee = drMaEmployee;
    }
    public DrTrLoanDue getDrTrLoanDue() {
        return this.drTrLoanDue;
    }
    
    public void setDrTrLoanDue(DrTrLoanDue drTrLoanDue) {
        this.drTrLoanDue = drTrLoanDue;
    }
    public BigInteger getLpAmountPaid() {
        return this.lpAmountPaid;
    }
    
    public void setLpAmountPaid(BigInteger lpAmountPaid) {
        this.lpAmountPaid = lpAmountPaid;
    }
    public Date getLpDate() {
        return this.lpDate;
    }
    
    public void setLpDate(Date lpDate) {
        this.lpDate = lpDate;
    }
    public Set getDrTrLoanDues() {
        return this.drTrLoanDues;
    }
    
    public void setDrTrLoanDues(Set drTrLoanDues) {
        this.drTrLoanDues = drTrLoanDues;
    }




}


