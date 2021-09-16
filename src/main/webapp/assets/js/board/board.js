let previewIndex = 0;
let files = {};

$(document).ready(() => {
    $("#btnAddFile").click(() => {
        $("#addFile").click();
    })
    $("#addFile").change(() => {
        addPreview($("#addFile"))
    })
    $("#send").click(() => {
        let form = $('#boardForm')[0];
        let formData = new FormData(form);

        for (let i = 0; i < Object.keys(files).length; i++) {
            formData.append('files', files[i]);
        }
        console.log(formData);
        $.ajax({
            type: 'post',
            enctype: 'multipart/form-data',
            processData: false,
            contentType: false,
            timeout: 3000,
            url : '/board/add',
            dataType: 'JSON',
            data: formData,
            success: result => {
                alert(result);
            }
        })
    })
})

const addPreview = (input) => {
    if (input[0].files) {
        for (let fileIndex = 0; fileIndex < input[0].files.length; fileIndex++) {
            let file = input[0].files[fileIndex];

            if (validation(file.name))
                continue;

            const reader = new FileReader();
            let imgNum = previewIndex++;

            $("#fileUpload").append(
                "<div class=\"preview\">"
              //  + "<img src=\"" + img.target.result + "\"\/>"
                + "<p>"
                + file.name
                + "</p>"
                + "<a href=\"#\" value=\""
                + imgNum
                + "\" onclick=\"rmPreview(this)\">"
                + "삭제" + "</a>" + "</div>"
            );
            files[imgNum] = file;
            reader.onload = function (img) {
                //div id="preview" 내에 동적코드추가.
                //이 부분을 수정해서 이미지 링크 외 파일명, 사이즈 등의 부가설명을 할 수 있을 것이다.
                var imgNum = previewIndex++;

                reader.readAsDataURL(file);
            };

        }
    } else
        alert('invalid file input');
}

//TODO 파일확장자명 검사
const validation = fileName => {
    let extensionIndex = fileName.lastIndexOf('.') + 1;
    let extension = fileName.toLowerCase().substring(
       extensionIndex, fileName.length);

    //TODO 추가해야함
}

const rmPreview = target => {

}
