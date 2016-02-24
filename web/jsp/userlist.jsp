<%--
  Created by IntelliJ IDEA.
  User: panda
  Date: 2016/2/5 0005
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>userlist</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/style/css.css"/>
</head>
<body>
<c:forEach var="user" items="${userlist}">
    <p>
            ${user.username}///
            ${user.password}///
            ${user.name}///
        <a href="${pageContext.request.contextPath}/delete.do?id=${user.id}">删除</a>
        <a href="${pageContext.request.contextPath}/findById.do?id=${user.id}">编辑</a>
    </p>
</c:forEach>
</body>
</html>
