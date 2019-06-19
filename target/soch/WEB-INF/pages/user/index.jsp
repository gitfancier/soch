<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/18
  Time: 22:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户中心</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>

<%--    <link href="${pageContext.request.contextPath }/resource/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <script src="${pageContext.request.contextPath }/resource/js/jquery2.1.1.min.js"></script>
    <script src="${pageContext.request.contextPath }/resource/bootstrap/js/bootstrap.min.js"></script>--%>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <nav class="navbar navbar-default" role="navigation">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button> <a class="navbar-brand" href="#">Brand</a>
                </div>

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li class="active">
                            <a href="#">Link</a>
                        </li>
                        <li>
                            <a href="#">Link</a>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<strong class="caret"></strong></a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="#">Action</a>
                                </li>
                                <li>
                                    <a href="#">Another action</a>
                                </li>
                                <li>
                                    <a href="#">Something else here</a>
                                </li>
                                <li class="divider">
                                </li>
                                <li>
                                    <a href="#">Separated link</a>
                                </li>
                                <li class="divider">
                                </li>
                                <li>
                                    <a href="#">One more separated link</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                    <form class="navbar-form navbar-left" role="search">
                        <div class="form-group">
                            <input type="text" class="form-control" />
                        </div> <button type="submit" class="btn btn-default">Submit</button>
                    </form>
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <a href="#">Link</a>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<strong class="caret"></strong></a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="#">Action</a>
                                </li>
                                <li>
                                    <a href="#">Another action</a>
                                </li>
                                <li>
                                    <a href="#">Something else here</a>
                                </li>
                                <li class="divider">
                                </li>
                                <li>
                                    <a href="#">Separated link</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>

            </nav>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-2 column">
            <div class="list-group">
                <a href="#" class="list-group-item active">Home</a>
                <div class="list-group-item">
                    List header
                </div>
                <div class="list-group-item">
                    列表1
                </div>
                <div class="list-group-item">
                    <span class="badge badge-danger">14</span> Help
                </div>
            </div>
        </div>
        <div class="col-md-10 column">
            <div class="panel panel-default">

                <div class="panel-heading">

                    <h3 class="panel-title">
                        <button type="button" class="btn btn-sm btn-primary "data-toggle="modal" data-target="#myModal">添加</button>
                    </h3>
                </div>
                <div class="panel-body">
                    <table class="table">
                        <caption>添加的试题</caption>
                        <thead>
                        <tr>
                            <th>ID</th>
                            <th>问题</th>
                            <th>答案</th>
                            <th>提供者</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr class="active">
                            <td>产品1</td>
                            <td>23/11/2013</td>
                            <td>待发货</td>
                            <td>111</td>
                        </tr>
                        <td></td>
                        </tbody>
                    </table>
                </div>
            </div>
            <ul class="pagination">
                <li>
                    <a href="#">Prev</a>
                </li>
                <li>
                    <a href="#">1</a>
                </li>
                <li>
                    <a href="#">2</a>
                </li>
                <li>
                    <a href="#">3</a>
                </li>
                <li>
                    <a href="#">4</a>
                </li>
                <li>
                    <a href="#">5</a>
                </li>
                <li>
                    <a href="#">Next</a>
                </li>
            </ul>
        </div>
    </div>
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    <h4 class="modal-title" id="myModalLabel">添加试题</h4>
                </div>
                <div class="modal-body">
                    <form>
                        问题：<input type="text" name="question" id="question">
                        答案：<input type="text" name="answer" id="answer">
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary">提交</button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div>
</div>
<script>
    $(function() {
        $('#myModal').modal('hide')
    });
</script>
<script>
    $(function() {
        $('#myModal').on('hide.bs.modal',
            function() {
                alert('嘿，我听说您喜欢模态框...');
            })
    });
</script>
</body>
</html>
