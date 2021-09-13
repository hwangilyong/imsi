let fileUploadRow = 1;
$(document).ready(() => {
   $("#addFile").click(() => {
      $("#fileUpload td:nth-child(1)").attr("rowspan", ++fileUploadRow);
      $("#fileUpload").after("<tr><td><input type='file' name='uploadFile'></td></tr>");

   });
});