const call = (type, url, parameter, callback) => {
    call : (type, url, parameter, callback) => {
        $.ajax({
            type: type,
            url: url,
            data: parameter,
            success: callback
        });
    }
}