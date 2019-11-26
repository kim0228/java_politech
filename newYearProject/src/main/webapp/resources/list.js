$(function(){
	$.ajax({
		url:'/volume_list',
		success:function(data){
			console.log(data)
			for(var i=0; i<data.length; i++){
				$html_string = '<tr>';
				$html_string = $html_string + '<td>'+ data[i]['regionid']+'</td>'
				$html_string = $html_string + '<td>'+ data[i]['productgroup']+'</td>'
				$html_string = $html_string + '<td>'+data[i]['yearweek']+'</td>';
				$html_string = $html_string + '<td>'+data[i]['volume']+'</td>';
				$html_string = $html_string + '<td>'+'<button class="mod_row">수정하기</button><button class="mod_done">수정완료</button>'+'</td>';		
				$('#list').append($html_string);
			}
		}
	
	});
});