let fileUploadRow = 1;
$(document).ready(() => {
   $("input[name='uploadFile']").change(() => {
      $("#fileUpload td:nth-child(1)").attr("rowspan", ++fileUploadRow);
      $("#fileUpload").after("<tr><td><input type='file' name='uploadFile'></td></tr>");
   });

   $(".rmFile").click(() => {
      $(this).parent('tr').empty();
      fileUploadRow--;
   })
});
