<%--
  Created by IntelliJ IDEA.
  User: lrc2020
  Date: 2022/6/14
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加书籍</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="row clearfix">
    <div class="col-md-12 column">
        <div class="page-header">
            <h1>
                <small>增加书籍</small>
            </h1>
        </div>
    </div>
</div>
<form action="${pageContext.request.contextPath}/book/addBook" method="post">
    书籍名称：<input type="text" name="bookName">
    书籍数量：<input type="text" name="bookCounts">
    书籍描述：<input type="text" name="detail">
    <input type="submit" value="添加">
    </div>
</form>
</body>
</html>
