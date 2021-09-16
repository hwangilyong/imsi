<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HIY
  Date: 2021-09-10
  Time: 오후 3:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="content">
        <table id="dataBoard" border="">
            <tr>
                <td>제목</td>
                <td>${boardVO.boardTitle}</td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <div id="fileUpload">
                        <c:if test="${fileVOList != null}">
                            <c:forEach var="fileVO" items="${fileVOList}">
                                <a href="">${fileVO.fileOrglNm}</a>
                            </c:forEach>
                        </c:if>
                    </div>
                </td>
            </tr>
            <tr>
                <td>내용</td>
                <td>${boardVO.boardContent}</td>
            </tr>
        </table>
</div>
