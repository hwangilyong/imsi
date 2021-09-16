<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script>
$(document).ready(() => {
    $('#btnBoardAdd').click(() => {
        location.href= '/board/add';
    })
})
</script>
<div class="content">
    <table>
        <thead>
            <tr>
                <td>제목</td>
                <td>등록날짜</td>
            </tr>
        </thead>
        <tbody>
        <c:if test="${boardVOList != null}">
            <c:forEach var="boardVO" item="${boardVOList}">
                <tr>
                    <td>${boardVO.boardTitle}</td>
                    <td>${boardVO.registDt}</td>
                </tr>
            </c:forEach>
        </c:if>
        </tbody>
    </table>
    <button id="btnBoardAdd" type="button">add</button>
</div>
