<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>soch</title>
    <link href="${pageContext.request.contextPath }/resource/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath }/resource/js/jquery2.1.1.min.js"></script>
    <script src="${pageContext.request.contextPath }/resource/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<h3>查询所有题目...</h3>
<%--<div><img src="${pageContext.request.contextPath }/resource/images/fengyulan.jpg"></div>--%>
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
