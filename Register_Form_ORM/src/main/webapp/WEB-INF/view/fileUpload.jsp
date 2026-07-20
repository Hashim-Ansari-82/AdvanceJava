<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>File Upload Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
	<link rel="stylesheet" href='<c:url value="/resources/css/style.css"/>'>
</head>
<body class="bg-dark vh-100 justify-content-center align-items-center d-flex p-4">

	<div class="text-center col-md-6 offset-md-3 container">
		<div class="card">
			<div class="card-header bg-secondary">
				<h2 class=>Welcome to file Upload</h2>
			</div>
			<form class="mt-3" action="fileUpload" method="post" enctype="multipart/form-data">
				<input type="file" name="img" class="form-control">
			
			<div class="mt-3 mb-3">
				<button type="submit" class="btn btn-info col-md-5">File Upload</button>
			</div>
			</form>
		</div> 
	</div>
</body>
</html>