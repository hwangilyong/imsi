$(document).ready(() => {
    $("#btnLogin").click(() => {
        location.href = "/login";
    });

    $("#btnJoin").click(() => {
        location.href = "/join";
    })

    $("#btnBoard").click(() => {
        location.href = "/board/list";
    })
})