<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link rel="stylesheet" href='<c:url value="/resources/css/style.css"/>'>
<script type="text/javascript" src='<c:url value="/resources/js/script.js"/>'></script>
</head>
<body
	class="d-flex justify-content-center align-items-center vh-100 bg-secondary">
	<div class="container">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-header text-center bg-dark text-white">
						<h2>Search Engine</h2>
					</div>
					<div class="card-body">
						<form action="search" method="post">
							<div class="mb-3">
								<input type="text" name="keyword" class="form-control"
									placeholder="Enter Keyword">
								<div class="text-center mt-4">
									<button class="btn btn-primary col-md-6">Search</button>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>