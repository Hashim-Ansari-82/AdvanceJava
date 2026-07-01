<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
</head>
<body>
<h3 class="text-center p-4 bold-text" style="color:green">Register Successfully</h3><hr>
 <h4>User Name : ${user.fullName}</h4>
 <h4>Email : ${user.email}</h4>
 <h4>Password : ${user.password}</h4>
 <h4>Image : ${user.image}</h4>
 <div class="text-center">
 <h3 style="color:navy"><a href="register">Go to Register Page</a></h3>
 </div>
</body>
</html>