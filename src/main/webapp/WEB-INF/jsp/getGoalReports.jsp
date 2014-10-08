<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 03/10/2014
  Time: 03:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>View All Goals</title>
</head>
<body>



    <table>
        <thead>
        <th>Goal Minutes</th>
        <th>Activity</th>
        <th>Exercise Minutes</th>
        </thead>
        <c:forEach items="${goalReports}" var="agoalReport">
        <tbody>

        <tr>

            <td>${agoalReport.goalMinutes}</td>
            <td>${agoalReport.exerciseActivity}</td>
            <td>${agoalReport.exerciseMinutes}</td>

        </tr>

        </tbody>
        </c:forEach>

    </table>




</body>
</html>
