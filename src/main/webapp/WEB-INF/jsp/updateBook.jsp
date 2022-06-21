<%--
  Created by IntelliJ IDEA.
  User: lrc2020
  Date: 2022/6/14
  Time: 21:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
</head>
<body>
<div class="row clearfix">
    <div class="col-md-12 column">
        <div class="page-header">
            <h1>
                <small>修改书籍</small>
            </h1>
        </div>
    </div>
</div>
<form action="${pageContext.request.contextPath}/book/updateBook" method="post">
    <input type="hidden" name="bookId" value="${books.bookId}">
    书籍名称：<input type="text" name="bookName" value="${books.bookName}">
    书籍数量：<input type="text" name="bookCounts" value="${books.bookCounts}">
    书籍描述：<input type="text" name="detail" value="${books.detail}">
    <input type="submit" value="修改">
    </div>
</form>
</body>
</html>
