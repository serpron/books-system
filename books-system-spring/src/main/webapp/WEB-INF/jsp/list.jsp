<%@ page contentType="text/html;charset=utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8"/>
</head>
<body>
<h2>藏在WEB-INF下的jSP</h2>
<ul>
<c:forEach items="${list}" var="user">
    <li>${user.name}</li>
</c:forEach>
</ul>
</body>
</html>
