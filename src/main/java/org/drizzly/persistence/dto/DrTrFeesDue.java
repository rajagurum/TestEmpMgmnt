package org.drizzly.persistence.dto;
// Generated 17 Oct, 2015 9:14:35 PM by Hibernate Tools 4.3.1


import java.math.BigInteger;
import java.util.Date;

/**
 * DrTrFeesDue generated by hbm2java
 */
public class DrTrFeesDue  implements java.io.Serializable {


     private Long fpId;
     private DrMaStudent drMaStudent;
     private BigInteger fpAmountPaid;
     private Date fpPaidDate;
     private String fpMonth;
     private String fdTerm;
     private String fdYearly;

    public DrTrFeesDue() {
    }

	
    public DrTrFeesDue(DrMaStudent drMaStudent, BigInteger fpAmountPaid, Date fpPaidDate) {
        this.drMaStudent = drMaStudent;
        this.fpAmountPaid = fpAmountPaid;
        this.fpPaidDate = fpPaidDate;
    }
    public DrTrFeesDue(DrMaStudent drMaStudent, BigInteger fpAmountPaid, Date fpPaidDate, String fpMonth, String fdTerm, String fdYearly) {
       this.drMaStudent = drMaStudent;
       this.fpAmountPaid = fpAmountPaid;
       this.fpPaidDate = fpPaidDate;
       this.fpMonth = fpMonth;
       this.fdTerm = fdTerm;
       this.fdYearly = fdYearly;
    }
   
    public Long getFpId() {
        return this.fpId;
    }
    
    public void setFpId(Long fpId) {
        this.fpId = fpId;
    }
    public DrMaStudent getDrMaStudent() {
        return this.drMaStudent;
    }
    
    public void setDrMaStudent(DrMaStudent drMaStudent) {
        this.drMaStudent = drMaStudent;
    }
    public BigInteger getFpAmountPaid() {
        return this.fpAmountPaid;
    }
    
    public void setFpAmountPaid(BigInteger fpAmountPaid) {
        this.fpAmountPaid = fpAmountPaid;
    }
    public Date getFpPaidDate() {
        return this.fpPaidDate;
    }
    
    public void setFpPaidDate(Date fpPaidDate) {
        this.fpPaidDate = fpPaidDate;
    }
    public String getFpMonth() {
        return this.fpMonth;
    }
    
    public void setFpMonth(String fpMonth) {
        this.fpMonth = fpMonth;
    }
    public String getFdTerm() {
        return this.fdTerm;
    }
    
    public void setFdTerm(String fdTerm) {
        this.fdTerm = fdTerm;
    }
    public String getFdYearly() {
        return this.fdYearly;
    }
    
    public void setFdYearly(String fdYearly) {
        this.fdYearly = fdYearly;
    }




}


