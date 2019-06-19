<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/12
  Time: 19:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>查询所有账户...</h3>
    <table>
        <tr>
            <th>Name</th>
            <th>Money</th>
        </tr>
    <c:forEach items="${list}" var="account">
        <tr>
                <td>${account.name}</td><td>${account.money}</td>
        </tr>
    </c:forEach>
    </table>



</body>
</html>
