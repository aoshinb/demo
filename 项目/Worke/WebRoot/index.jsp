<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<link rel="stylesheet" href="<%=basePath %>/common/layui/css/layui.css">
<script src="<%=basePath %>/common/layui/layui.js"></script>
<script type="text/javascript" src="<%=basePath %>/BackJs/jquery-1.12.4.js"></script>
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
<div style="width: 500px;">
	<form action="javascript:void(0);" method="post">
		<table border="1px"  class="layui">
				<tr>
						<td colspan="2"><h2>用户登录</h2></td>
				</tr>
				<tr>
						<td>用户</td>
						<td><input type="text" id="name" name="username" placeholder="请输入标题" style="background-color:transparent"></td>
				</tr>
				<tr>
						<td>密码框</td>
						<td><input type="password" id="pwd" name="password" placeholder="请输入密码" style="background-color:transparent"></td>
				</tr>
				<tr>
						<td><button type="reset">重置</button></td>
						<td><input type="submit" onclick="deng();" value="提交"></td>
				</tr>
		</table>
</form>
	<script type="text/javascript" src="<%=basePath %>/Login.js"></script>
</div>

