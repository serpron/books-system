<%@ page contentType="text/html;charset=utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8"/>
    <script type="text/javascript" src="/static/js/jquery-1.11.1.min.js"></script>
    <script>
        $(function(){
            $.get("/user/findAll3",function(data){
                $("#userSelect").html(data);
            });
        });
    </script>
</head>
<body>
    <h2>下拉列表</h2>
    <select id="userSelect"></select>
</body>
</html>
