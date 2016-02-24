<%--
  Created by IntelliJ IDEA.
  User: cn.panda
  Date: 2016/2/2 0002
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/style/css.css">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
<form action="/register.do" method="post">
    <p>
        <label for="username">用户名</label>
        <input type="text" name="username"/>
    </p>
    <p>
        <label for="password">密码</label>
        <input type="text" name="password"/>
    </p>
    <p>
        <label for="name">姓名</label>
        <input type="text" name="name">
    </p>
    <p>

        <input type="submit">

        <input type="reset"/>
    </p>
</form>
</body>
</html>
