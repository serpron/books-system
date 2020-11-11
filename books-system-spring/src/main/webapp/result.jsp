<%@ page contentType="text/html;charset=utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8"/>
</head>
<body>
<h2>请求作用域：${requestScope.user1.name}</h2>
<h2>请求作用域：${sessionScope.user2.name}</h2>
</body>
</html>
