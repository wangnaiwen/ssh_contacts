<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8 "
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>员工管理系统</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <frameset rows="80,*">
   <frame name="top" src="${pageContext.request.contextPath}/frame/top.jsp">
   <frameset cols="150,*" id="main">

      <frame src="${pageContext.request.contextPath}/frame/left.jsp"> 
     <frame name="right" src="${pageContext.request.contextPath}/frame/right.html">
   </frameset>
</frameset>
</html>
