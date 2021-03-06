<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>新增用户</title>
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta name="apple-mobile-web-app-status-bar-style" content="black">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta name="format-detection" content="telephone=no">
	<link rel="stylesheet" href="<%=basePath %>/common/layui/css/layui-v2.5.5/css/layui.css" media="all" />
	<link rel="stylesheet" href="<%=basePath %>/common/layui/css/public.css" media="all" />
</head>
<body class="childrenBody">
<form class="layui-form layui-form-pane" action="Javascript:void(0)">

   <div class="layui-form-item">
    <label class="layui-form-label">姓名</label>
    <div class="layui-input-inline">
      <input type="text" name="realName" id="realName" lay-verify="required" placeholder="请输入员工姓名" autocomplete="off" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">角色</label>
    <div class="layui-input-inline">
      <select name="role1" id="role1" lay-filter="role1">
      	
      </select>
   </div>
  </div>
  
   <div class="layui-form-item">
    <label class="layui-form-label">部门</label>
    <div class="layui-input-inline">
      <select name="role2" id="role2" lay-filter="role2">
      	
      </select>
   </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">职称</label>
    <div class="layui-input-inline">
      <select name="role3" id="role3" lay-filter="role3">
      	
      </select>
   </div>
  </div>
  
  <div class="layui-form-item">
    <button class="layui-btn layui-btn-fluid" id="tijiao" lay-filter="addUser">新增用户</button>
  </div>
</form>
<script type="text/javascript" src="<%=basePath %>/common/layui/css/layui-v2.5.5/layui.js"></script>
<script type="text/javascript" src="<%=basePath %>/BackJs/jquery-1.12.4.js"></script>
<script type="text/javascript" src="<%=basePath %>/common/popjs/YGadd.js"></script>
</body>
</html>