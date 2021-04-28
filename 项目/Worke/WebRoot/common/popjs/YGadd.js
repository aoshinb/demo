layui.use(['form', 'layedit', 'laydate'], function(){
  var form = layui.form
  ,layer = layui.layer
  ,layedit = layui.layedit
  ,laydate = layui.laydate;
  //角色
  $.ajax({
	  url:"http://localhost:8080/Worke/Servlet?action=seleJS",
	  type:"post",
	  async:false,
	  success:function(data){
		  var info = eval("("+data+")");
		  var row = info;
		  var role = $("#role1");
		  var html = '';
		  $.each(row,function(index,item){
			  html += '<option value="'+item.id+'">'+item.roe+'</option>';
		  })
		  role.html(html);
		  form.render("select");
	  }
  })
  //部门
  $.ajax({
	  url:"http://localhost:8080/Worke/Servlet?action=seleBM",
	  type:"post",
	  async:false,
	  success:function(data){
		  var info = eval("("+data+")");
		  var row = info;
		  var role = $("#role2");
		  var html = '';
		  $.each(row,function(index,item){
			  html += '<option value="'+item.id+'">'+item.bu+'</option>';
		  })
		  role.html(html);
		  form.render("select");
	  }
  })
  //职称
  $.ajax({
	  url:"http://localhost:8080/Worke/Servlet?action=seleZC",
	  type:"post",
	  async:false,
	  success:function(data){
		  var info = eval("("+data+")");
		  var row = info;
		  var role = $("#role3");
		  var html = '';
		  $.each(row,function(index,item){
			  html += '<option value="'+item.id+'">'+item.raname+'</option>';
		  })
		  role.html(html);
		  form.render("select");
	  }
  })
  
  
  $("#tijiao").click(function(){
	  var name = $("#realName").val();
	  var sex = $("input[type='radio']:checked").val();
	  var js = $("select[name='role1']").val();
	  var bm = $("select[name='role2']").val();
	  var zc = $("select[name='role3']").val();
	  var data = {
			  "name":name,
			  "sex":sex,
			  "js":js,
			  "bm":bm,
			  "zc":zc
	  }
	 
	  $.ajax({
	  		url:"http://localhost:8080/Worke/Servlet?action=addYG",
			data:data,
			tyep:"post",
			success:function(data){
				if(data == 1){
					layer.msg("添加成功")
					setTimeout(function(){
						parent.layer.closeAll("iframe");
			            //刷新父页面
			          /*  parent.location.reload();*/
						parent.layui.table.reload("test");
		        	},1000);
				}else{
					layer.msg("系统异常");
				}
				
			}
	  })
	  return false;
  })
  
});
