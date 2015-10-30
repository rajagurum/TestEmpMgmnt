<%-- 
    Document   : addEmployee
    Created on : 18 Oct, 2015, 11:06:20 PM
    Author     : rajaguru
--%>

<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>
<!DOCTYPE html>
<html>
    <head>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
        <%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add new Employee</title>
    </head>
    <body>
        <h1>${drizzlyheader}</h1>
        <f:form command="/Drizzly/insertEmployee.html" method="post">
            <table>
                <tr>
                    <td>Employee Name : </td>
                    <td><f:input path="emName" type="text" name="emName"/></td>
                </tr>
                <tr>
                    <td>Employee Address : </td>
                    <td><f:input path="emAddress" type="text" name="emAddress"/></td>
                </tr>
                <tr>
                    <td>Employee City : </td>
                    <td><f:input path="emCity" type="text" name="emCity"/></td>
                </tr>
                <tr>
                    <td>Employee State : </td>
                    <td><f:input path="emState" type="text" name="emState"/></td>
                </tr>
                <tr>
                    <td>Employee Pincode : </td>
                    <td><f:input path="emPincode" type="text" name="emPincode"/></td>
                </tr>
                <tr>
                    <td>Employee Country : </td>
                    <td><f:input path="emCountry" type="text" name="emCountry"/></td>
                </tr>
                <tr>
                    <td>Employee Salary : </td>
                    <td><f:input path="emSalary" type="text" name="emSalary"/></td>
                </tr>
                <tr>
                    <td>Employee Mobile1 : </td>
                    <td><f:input path="emMobile1" type="text" name="emMobile1"/></td>
                </tr>
                <tr>
                    <td>Employee Mobile2 : </td>
                    <td><f:input path="emMobile2" type="text" name="emMobile2"/></td>
                </tr>
                <tr>
                    <td>Employee Email : </td>
                    <td><f:input path="emEmail1" type="text" name="emEmail1"/></td>
                </tr>
                <tr>
                    <td>Employee Joined Date : </td>
                    <td><f:input path="emJoinDate" type="date" name="emJoinDate"/></td>
                </tr>
            </table>
            <p>
                <input type="submit" value="Add Employee"/>
            </p>
        </f:form>
    </body>
</html>
