function deng(){
	var name = $("#name").val();
	var pwd = $("#pwd").val();
	var item = {
		"name":name,
		"pwd":pwd	
	}
	$.ajax({
		url:"http://localhost:8080/Worke/Servlet?action=Login",
		data:item,
		tyep:"post",
		success:function(data){
			alert(data);
			if(data > 0){
				//layer.msg("登录成功")
					location.href="http://localhost:8080/Worke/Servlet?action=seleQX&id="+data;
			}else{
				alert("失败");
			}
		}
	})
}