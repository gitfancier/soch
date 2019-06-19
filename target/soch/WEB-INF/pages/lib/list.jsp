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
    <title>查询结果</title>
</head>
<body>
    <h3>查询所有题目...</h3>
    <table>
        <tr>
            <th>ID</th>
            <th>题目</th>
            <th>答案</th>
            <th>提供者</th>
        </tr>
    <c:forEach items="${list}" var="li">
        <tr>
            <td>${li.id}</td>
            <td>${li.question}</td>
            <td>${li.answer}</td>
            <td>${li.uId}</td>
        </tr>
    </c:forEach>
    </table>



</body>
</html>
