<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 08/10/2014
  Time: 07:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Fitness Tracker Custom Login Page</title>

    <style type="text/css">
        .errorblock
        {
            color: #ff0000;
            background-color: #ffEEEE;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;
        }
    </style>
</head>
<body onload="document.f.j_username.focus();">

<h3>Fitness Tracker Custom Login Page</h3>

<c:if test="${not empty error}">
    <div class="errorblock">
        Your login was unsuccessful.<br/>
        Caused: ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
    </div>
</c:if>

<form action="j_spring_security_check" name="f" method="POST">

    <table>
        <tr>
            <td>User:</td>
            <td><input type="text" name="j_username" value=""></td>
        </tr>

        <tr>
            <td>Password</td>
            <td><input type="password" name="j_password"></td>
        </tr>

        <tr>
            <td colspan="2"><input type="submit" name="Submit" value="Submit"></td>
        </tr>

        <tr>
            <td colspan="2"><input type="reset" name="Reset" value="Reset"></td>
        </tr>
    </table>

</form>

</body>
</html>
