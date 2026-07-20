<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
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
</head>
<body>
	<div class="text-center">
		<h1>Welcome to Home Page</h1>
		<hr>
		<c:if test="${empty loginUser }">
			<a href="login" class="btn btn-primary col-md-2 me-2">Login Page</a>
		</c:if>
		<a href="user/profile" class="btn btn-success col-md-2">Profile
			Page</a>
		<c:if test="${not empty loginUser }">
			<a href="user/logout" class="btn btn-primary col-md-2 me-2">Logout Page</a>
		</c:if>
	</div>
</body>
</html>