<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
	<link rel="stylesheet" href="<c:url value="/resource/css/style.css"/>">
</head>
<body class="d-flex justify-content-center align-items-center vh-100">

	<div class="container p-5">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card" style="width: 500px;">
					<div class="card-header bg-dark text-white">
						<h3 class="text-center">Welcome to Login Page</h3>
					</div>
					<div class="card-body">
						<form action="createUser" method="post">
							<div class="mb-3">
								<label for="name" class="form-label">Full name </label> <input
									type="text" class="form-control" name="fullName"
									placeholder="Enter your name">
							</div>
							<div class="mb-3">
								<label for="email" class="form-label">Email address</label> <input
									type="text" class="form-control" name="email"
									placeholder="Enter your email">
							</div>
							<div class="mb-3">
								<label for="password" class="form-label">Password</label> <input
									type="password" class="form-control" name="password"
									placeholder="Enter your password">
							</div>
							<div class="mb-3 form-check">
								<input type="checkbox" class="form-check-input" name="check"
									id="exampleCheck1"> <label class="form-check-label"
									for="exampleCheck1">Check me out</label>
							</div>
							<div class="text-center mt-4">
								<button type="submit" class="btn btn-secondary col-md-6">Register</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script>
		src = "https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity = "sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin = "anonymous">
	</script>
</body>
</html>