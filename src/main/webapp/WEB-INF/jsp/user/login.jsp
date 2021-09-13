<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021-09-11
  Time: 오후 1:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="content">
    <form action="/login" method="post">
        <input type="text" name="userId" placeholder="id">
        <input type="password" name="userPassword" placeholder="password">
        <input type="submit" value="LOGIN">
    </form>
</div>
