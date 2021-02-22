 $('#todoTable').DataTable({
     dom: 'Bfrtip',
     "pageLength": 5
 });


$( "#add_todo" ).submit(function( event ) {
    Swal.fire({
        icon: 'success',
        title: 'Todo Added',
        text: 'New todo successfully added'
    });
event.preventDefault();
});



$(document).ready( function () {
    $('#todoTable #update').on('click', function () {
        var id = $(this).parent().find('#id').val();
        var title = $(this).parent().find('#title').val();
        var description = $(this).parent().find('#description').val();
        var done = $(this).parent().find('#done').val();

        console.log(done);
        $('#updateModal #id').val(id);
        $('#updateModal #title').val(title);
        $('#updateModal #description').val(description);
        if (done == 'true')
            $("#updateModal #done").prop("checked", true);
        if (done == 'false')
            $("#updateModal #done").prop("checked", false);

    });
});
    // $('#update_todo').on('click', function (e){
    //     $("#todo_update").ajaxSubmit({url: '/save', type: 'post'})
    // });


 $( "#delete_todo").click(function( event ) {
     Swal.fire({
         title: 'Do you want to save the changes?',
         showDenyButton: true,
         showCancelButton: true,
         confirmButtonText: `Save`,
         denyButtonText: `Don't save`,
     }).then((result) => {
         /* Read more about isConfirmed, isDenied below */
         if (result.isConfirmed) {
             Swal.fire('Saved!', '', 'success');

         } else if (result.isDenied) {
             Swal.fire('Changes are not saved', '', 'info')
         }
     });
     event.preventDefault();
 });