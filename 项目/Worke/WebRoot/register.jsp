<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ceshi.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
 	.layui{
 	 text-align:center;
 	 width:400px;
 	}
 body{
 	margin:300 0;
 	padding:0 35%;
 	background:url('images/face/微信图片_202003181520266.bmp');background-repeat: no-repeat;
 	background-size:100%;
 	}
 </style>
  </head>
  <script type="text/javascript" src="${ctx}/lay/modules/jquery-1.8.2.min.js"></script>
  <body id="beijin">
  		<!-- <form action="log?action=login" method="post">
  				用户:<input type="text" value="" class="l_user" placeholder="用户名" name="username"/><br>
  				<input type="text"  placeholder="密码" name="password" />
  				<input type="submit" value="提交">
  		</form> -->
<form action="log?action=login" method="post">
		<table border="1px"  class="layui">
				<tr>
						<td colspan="2"><h2>用户登录</h2></td>
				</tr>
				<tr>
						<td>用户</td>
						<td><input type="text" name="username" placeholder="请输入标题" style="background-color:transparent"></td>
				</tr>
				<tr>
						<td>密码框</td>
						<td><input type="password" name="password" placeholder="请输入密码" style="background-color:transparent"></td>
				</tr>
				<tr>
						<td><button type="reset">重置</button></td>
						<td><input type="submit" value="提交"></td>
				</tr>
		</table>
</form>
  </body>
</html>