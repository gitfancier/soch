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
<%--<div><img src="${pageContext.request.contextPath }/resource/images/fengyulan.jpg"></div>--%>
<div class="" style="height: 150px"></div>
<div class="container-fluid">
    <span style="text-align: center"><h1>soch</h1></span>
    <div class="row">
        <div class="col-3"></div>
        <div class="col-8">
            <form class="form-group" role="form" method="post" action="lib/find">
                <div class="col-10 input-group">
                    <input type="text" class="form-control" id="name" name="name" placeholder="请输入关键字">
                    <span>&nbsp;</span>
                    <span class="">
                         <button type="submit" class="btn btn-primary">搜题库</button>
                    </span>
                </div>
                <div class="col-2"></div>
            </form>
        </div>
        <div class="col-2"></div>
    </div>
</div>
<div style="margin-top: 150px" class="container">

</div>
</body>
</html>
