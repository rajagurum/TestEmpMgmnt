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
interface IEmpLoadDetails {

    Long getEmpId();

    BigDecimal getLoanAmt();

    Date getReceivedDate();

    void setEmpId(Long empId);

    void setLoanAmt(BigDecimal loanAmt);

    void setReceivedDate(Date receivedDate);

}
