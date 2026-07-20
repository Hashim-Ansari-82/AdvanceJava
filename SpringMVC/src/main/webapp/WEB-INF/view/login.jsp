<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="R"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
 <link rel="stylesheet" href="<R:url value="/resource/css/style.css"/>">
</head>
<body>
	<h1 style="text-align: center; color: navy">Welcome to login Page</h1>
	<hr>
	<%-- 	<%
	String standard = (String) request.getAttribute("standard");
	request.getAttribute("rollNo");
	request.getAttribute("course");
	%>  --%>
	<h2>Standard : ${standard}</h2>
	<h2>Roll No : ${rollNo}</h2>
	<h2>Course : ${course}</h2>
	<R:forEach items="${course}" var="list">
	 <H3>${list}</H3>
	</R:forEach>
</body>
</html>