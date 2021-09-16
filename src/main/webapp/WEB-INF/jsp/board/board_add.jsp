<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="/assets/js/board/board.js"></script>

<div class="content">
    <input id="addFile" multiple="multiple" type="file" name="uploadFile" placeholder="tilte" style="display: none">
    <form id="boardForm" enctype="multipart/form-data" method="post">

        <table id="dataBoard" border="">
            <tr>
                <td>제목</td>
                <td><input type="text" name="boardTitle" placeholder="tilte"></td>
            </tr>
            <tr>
                <td>파일 첨부</td>
                <td><button type="button" id="btnAddFile">+</button></td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <div id="fileUpload">
                        <!-- 파일 업로드 영역-->
                    </div>
                </td>
            </tr>
            <tr>
                <td>내용</td>
                <td><textarea name="boardContent"></textarea></td>
            </tr>
            <tr>
                <td colspan="2"><button id="send" type="button">전송</button></td>
            </tr>
        </table>
    </form>
</div>
