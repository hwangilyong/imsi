<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021-09-11
  Time: 오후 1:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<html>
<head>
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
</head>
<body>
<script>
    let message = ${message};
    if (message != null) {
        alert(message);
    }
</script>
<tiles:insertAttribute name="header"/> <!--  /WEB-INF/views/common/layout/header.jsp -->
<tiles:insertAttribute name="body"/> <!-- body -->
<tiles:insertAttribute name="footer"/> <!-- /WEB-INF/views/common/layout/footer.jsp -->

</body>
</html>
