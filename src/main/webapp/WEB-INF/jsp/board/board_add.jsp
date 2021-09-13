<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="/assets/js/board/board.js"></script>

<div class="content">
    <form action="/board/add" enctype="multipart/form-data" method="post">
        <table id="dataBoard" border="">
            <tr>
                <td>제목</td>
                <td><input type="text" name="boardTitle" placeholder="tilte"></td>
            </tr>
            <tr id="fileUpload">
                <td rowspan="1">파일첨부</td>
                <td><input type="file" name="uploadFile" placeholder="tilte"></td>
            </tr>
            <tr>
                <td><button type="button" id="addFile">파일 추가</button></td>
            </tr>
            <tr>
                <td>내용</td>
                <td><textarea name="boardContent"></textarea></td>
            </tr>
            <tr>
                <td>전송</td>
                <td><input type="submit" value="전송"></td>
            </tr>
        </table>
    </form>
</div>
