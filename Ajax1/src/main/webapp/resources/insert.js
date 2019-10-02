var oEditors = [];
$(function(){
//  $.ajax({
//    url:'/ajax1/posts_details',
//    data:{'idx': idx},
//    success:function(data){
//      $('h3').text(data['title']);
//	  $('#de').html(data['description']);
//    }
//  });
  nhn.husky.EZCreator.createInIFrame({
   oAppRef: oEditors,
   elPlaceHolder: "de",
   sSkinURI: "/ajax1/resources/smarteditor/SmartEditor2Skin.html",
   fCreator: "createSEditor2"
  });
});

$(document).on('click', '.submit_button', function(event){
	oEditors.getById["de"].exec("UPDATE_CONTENTS_FIELD", []);
	
	var title = $('#title').val();
	var description = $('#de').val();
	  $.ajax({
	    url:'/ajax1/posts_insert',
	    data: {'title': title, 'description': description},
	    success:function(data){
	      location.href="/ajax1/posts";
	      //  console.log(data);
	    }
	});
});
