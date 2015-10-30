<%-- 
    Document   : EmployeeDetails
    Created on : 7 Oct, 2015, 2:19:24 AM
    Author     : rajaguru
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="http://code.jquery.com/jquery-latest.js"></script>
        <title>Drizzly</title>
    </head>
    <script>
        $(document).ready(function(){
            $("#editbutton").click(function(){
                $("div").toggle();
            });
        });
    </script>
        <h1>${drizzlyheader}</h1>
        
        <form:form action="/Drizzly/findAction.html" method="post">    
            <c:choose>
            <c:when test="${not empty employee}">
                <input type="button" id="editbutton" value="Do you want to edit ${employee.emName}">
                <div name = "displayForm" style="display: block">
                    <table>
                    <tr>
                        <td>Employee Name : </td>
                        <td>${employee.emName}</td>
                    </tr>
                    <tr>
                        <td>Employee Id : </td>
                        <td>${employee.emId}</td>
                    </tr>
                    <tr>
                        <td>Employee Salary : </td>
                        <td>${employee.emSalary}</td>
                    </tr>
                    <tr>
                        <td>Employee Mobile : </td>
                        <td>${employee.emMobile1}</td>
                    </tr>
                    <tr>
                        <td>Employee Joined Date : </td>
                        <td>${employee.emJoinDate}</td>
                    </tr>
                    </table>
                </div>
                <div name = "editForm" style="display: none">
                    <table>
                    <tr>
                        <td>Employee Name : </td>
                        <td><input type="text" name="emName" value="${employee.emName}"></td>
                    </tr>
                    <tr>
                        <td>Employee Salary : </td>
                        <td><input type="text" name="emSalary" value="${employee.emSalary}"></td>
                    </tr>
                    <tr>
                        <td>Employee Mobile 1 : </td>
                        <td><input type="text" name="emMobile1" value="${employee.emMobile1}"></td>
                    </tr>
                    <tr>
                        <td>Employee Joined Date : </td>
                        <td><input type="text" name="emJoinDate" value="${employee.emJoinDate}"></td>
                    </tr>
                    <tr>
                        <td>Employee Releived Date : </td>
                        <td><input type="text" name="emJoinDate" value="${employee.emReleivedDate}"></td>
                    </tr>
                    </table>
                </div>
            </c:when>
                <c:otherwise>
                <tr>
                    <td>No Such Employee in Drizzly</td>
                </tr>    
                </c:otherwise>
            </c:choose>
            
            <p>
                <input type="submit" value="findAnotherEmployee" name="doAction"/>
                <div name = "editForm" style="display: none">
                    <input type="submit" value="updateEmployee" name="doAction"/>
                </div>
            </p>
            
        </form:form>
    
</html>
