<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link rel="stylesheet" href="<c:url value="/resource/css/style.css"/>">
<script type="text/javascript"
	src='<c:url value="resource/js/script.js"/>'></script>
</head>
<body>
	<h1 class="text-center p-2" style="color: navy">Welcome to home
		Page</h1>
	<hr style="color:white">
	<h1 class="text-center" style="color: orange">
		<%
		String name = (String) request.getAttribute("name");
		%>
		Name :
		<%=name%>
	</h1>
	<h1 style="color: navy; text-align: center">
		ID : Name <br>
	</h1>
	<h2 style="text-align: center">
		<c:forEach items="${list}" var="entry">
        ${entry.key} : ${entry.value}<br>
		</c:forEach>
	</h2>
	<div class="text-center p-2">
		<a href="login" class="btn btn-success col-md-3">Login Page</a>
	</div>
	<div class="text-center p-2">
		<a href="register" class="btn btn-primary col-md-3">Register Page</a>
	</div>
</body>
</html>