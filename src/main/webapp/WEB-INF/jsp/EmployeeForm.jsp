<%-- 
    Document   : EmployeeForm
    Created on : 8 Oct, 2015, 1:06:10 AM
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
        <title>Employee Form</title>
    </head>
    <body>
        <form:form action="/Drizzly/findAction.html" method="post">
<!--            <p>
                Employee's Name : <input type="text" name="employeeName"/>
            </p>-->
            <p>
                Employee Id : <input type="text" name="employeeId" id="employeeId"/> 
            </p>
            <input type="submit" value="findEmployee" name="doAction"/>
            <input type="submit" value="deleteEmployee" name="doAction"/>
        </form:form>
    </body>
</html>
d