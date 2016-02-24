<%--
  Created by IntelliJ IDEA.
  User: panda
  Date: 16-2-12
  Time: 上午11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>微博首页</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/style/css.css"/>
</head>
<body>
<%--微博用户列表--%>
<h5>微博用户列表</h5>
<c:forEach var="user" items="${userList}" varStatus="status">
    <font color="red">${status.count}</font>&emsp;&emsp;${user.name}&emsp;&emsp;<fmt:formatDate
        value="${user.registerDate}" pattern="yyyy-MM-dd  HH:mm:ss"/><br/>
</c:forEach>

<%--发微博模块--%>
<h5>发微博了模块,当前用户：<font color="red">${user.name}</font>&emsp;&emsp;<a href="logout.do">注销</a></h5>

<form action="FaWeiBo.do" method="post">
    <textarea cols="30" rows="5" name="text"></textarea><br>
    <font size="2px" color="red">最多输入140字!</font><br>
    <input type="submit" value="发布"/> &emsp;&emsp;&emsp;<input type="reset" value="清空内容"/>
</form>


<%--微博列表模块--%>
<h5>微博列表</h5>
<table border="1" align="center">
    <tr>
        <td>序号</td>
        <td width="200px">发表时间</td>
        <td width="500px">内容</td>
        <td width="50px">发表人</td>
        <td width="200px">操作</td>
    </tr>
    <c:forEach var="weibo" items="${weiboList}" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td><fmt:formatDate value="${weibo.doDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
            <td>${weibo.text}</td>
            <td>${weibo.userName}</td>
            <td>
                <c:if test="${weibo.userId == user.id}">
                    <a href="${pageContext.request.contextPath}/delWeiBo.do?id=${weibo.id}">删除</a>
                </c:if>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
