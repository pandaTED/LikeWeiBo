<%--
  Created by IntelliJ IDEA.
  User: panda
  Date: 2016/2/2 0002
  Time: 20:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <link rel="stylesheet" href="style/css.css">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
<p>
    <a href="jsp/user/login.jsp">登录</a>
</p>
<p>
    <a href="jsp/user/register.jsp">注册</a>
</p>

<p>
    <a href="${pageContext.request.contextPath}/findAll.do">所有用户</a>
</p>
</body>
</html>
