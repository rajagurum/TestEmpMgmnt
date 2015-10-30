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
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add new Employee</title>
    </head>
    <body>
        <h1>${drizzlyheader}</h1>
        <form:form action="/Drizzly/insertEmployee.html" method="post">
            <table>
                <tr>
                    <td>Employee Name : </td>
                    <td><input type="text" name="emName"/></td>
                </tr>
                <tr>
                    <td>Employee Address : </td>
                    <td><input type="text" name="emAddress"/></td>
                </tr>
                <tr>
                    <td>Employee City : </td>
                    <td><input path="emCity" type="text" name="emCity"/></td>
                </tr>
                <tr>
                    <td>Employee State : </td>
                    <td><input type="text" name="emState"/></td>
                </tr>
                <tr>
                    <td>Employee Pincode : </td>
                    <td><input type="text" name="emPincode"/></td>
                </tr>
                <tr>
                    <td>Employee Country : </td>
                    <td><input type="text" name="emCountry"/></td>
                </tr>
                <tr>
                    <td>Employee Salary : </td>
                    <td><input type="text" name="emSalary"/></td>
                </tr>
                <tr>
                    <td>Employee Mobile1 : </td>
                    <td><input type="text" name="emMobile1"/></td>
                </tr>
                <tr>
                    <td>Employee Mobile2 : </td>
                    <td><input type="text" name="emMobile2"/></td>
                </tr>
                <tr>
                    <td>Employee Email : </td>
                    <td><input type="text" name="emEmail1"/></td>
                </tr>
                <tr>
                    <td>Employee Joining Date : </td>
                    <td><input type="text" name="emJoinDate"/></td>
                </tr>
                
            </table>
            <p>
                <input type="submit" value="Add Employee"/>
            </p>
        </form:form>
    </body>
</html>
