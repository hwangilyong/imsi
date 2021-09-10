<%--
  Created by IntelliJ IDEA.
  User: HIY
  Date: 2021-09-10
  Time: 오후 3:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <form action="/user/join" method="post">
        <input type="text" name="userId">
        <input type="password" name="userPassword">
        <button type="submit">JOIN</button>
    </form>
</div>
</body>
</html>
