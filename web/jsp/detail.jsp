<%--
  Created by IntelliJ IDEA.
  User: panda
  Date: 2016/2/5 0005
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>detail</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/style/css.css"/>
</head>
<body>
<h1>编辑</h1>
<form action="/update.do" method="post">
    <input type="hidden" name="id" value="${user.id}"/>
    <p>
        <label for="username">用户名</label>
        <input type="text" name="username" value="${user.username}"/>
    </p>
    <p>
        <label for="password">密码</label>
        <input type="text" name="password" value="${user.password}"/>
    </p>
    <p>
        <label for="name">姓名</label>
        <input type="text" name="name" value="${user.name}">
    </p>
    <p>

        <input type="submit">

        <input type="reset"/>
    </p>
</form>

</body>
</html>
