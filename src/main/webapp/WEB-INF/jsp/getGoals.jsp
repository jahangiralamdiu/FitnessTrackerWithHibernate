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

<c:forEach items="${goals}" var="agoal">

    <table>
        <thead>
        <th>ID</th>
        <th>Minutes</th>
        </thead>

        <tbody>

        <tr>
            <td>${agoal.id}</td>
            <td>${agoal.minutes}</td>
            <td>
                <table>

                    <thead>
                    <th>Ex ID</th>
                    <th>Activity</th>
                    <th>Minutes</th>
                    </thead>
                    <c:forEach items="${agoal.exercises}" var="aexercise">
                        <tbody>
                        <td>${aexercise.id}</td>
                        <td>${aexercise.activity}</td>
                        <td>${aexercise.minutes}</td>
                        </tbody>
                    </c:forEach>
                </table>
            </td>
        </tr>

        </tbody>

    </table>

</c:forEach>


</body>
</html>
