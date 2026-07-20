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
<link rel="stylesheet" href='<c:url value="/resources/css/style.css"/>'>
</head>
<body>

	<div class="container-fluid vh-100 justify-content-center align-items-center p-5">
		<div class="col-md-6 offset-md-3">
			<hr>
			  <h1 style="text-align: center; color: white">Welcome to home Page
			</h1>
			<hr>
		</div>
		<div class="text-center p-2">
			<a href="register" class="btn btn-success col-md-2">Register</a> <a
				href="google" class="btn btn-secondary col-md-2">Go To Google</a>
		</div>
		<div class="text-center p-2">
			<a href="yahoo" class="btn btn-warning col-md-2">Go To Yahoo</a> <a
				href="search" class="btn btn-primary col-md-2">Go To Search</a>
		</div>
		<div class="text-center p-2">
			<a href="file_Upload" class="btn btn-info col-md-2">File Upload</a>
		</div>
	</div>
</body>
</html>