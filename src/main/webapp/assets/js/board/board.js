let fileUploadRow = 1;
let fileBuffer = [];
$(document).ready(() => {
    $("#addFile").click(e => {
        $("#uploadFile").click();
    });

    $("#uploadFile").change(() => {
        fileBuffer = [];
        const target = document.getElementsByName("uploadFile[]");

        Array.prototype.push.apply(fileBuffer, target[0].files);
        const fileList = $('.fileList');

        $.each(target[0].files, (i, file) => {
            const fileName = file.name;

            fileList.append($("<div />", {
                class: "file"
            }).append($("<img />", {
                src: URL.createObjectURL(file)
            }))).append($("<span />", {
                text: fileName
            })).append($("<a />", {
                href: "#",
                class: "removeImg",
                text: X
            }));

            const fileEx = fileName.slice(fileName.indexOf(".") + 1).toLowerCase();
            // if(fileEx != "jpg" && fileEx != "png" &&  fileEx != "gif" &&  fileEx != "bmp" && fileEx != "wmv" && fileEx != "mp4" && fileEx != "avi"){
            //    alert("파일은 (jpg, png, gif, bmp, wmv, mp4, avi) 형식만 등록 가능합니다.");
            //    resetFile();
            //    return false;
            // }
            $('.fileList').html(html);
        });
    });
});
