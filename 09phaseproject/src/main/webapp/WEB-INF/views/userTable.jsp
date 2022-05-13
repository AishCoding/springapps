<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"
	import="com.springapps.phaseproject.controller.UserController, java.util.List"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Table for a specific user</h2>
	<c:set var="user_name" value="${user_name}" />
	</br>
	</br>
	<table border=1>
		<tr>
			<th>Username</th>
			<th>Category</th>
			<th>Product Id</th>
			<th>Quantity</th>
			<th>Price</th>
			<th>Date of Purchase</th>
		</tr>
		<c:forEach items="${usertable}" var="usertable">
			<c:if test="${usertable.username == user_name}">
				<tr>
					<td>${usertable.username}</td>
					<td>${usertable.category}</td>
					<td>${usertable.productid}</td>
					<td>${usertable.quantity}</td>
					<td>${usertable.price}</td>
					<td>${usertable.purchasedate}</td>
				</tr>
			</c:if>
		</c:forEach>
	</table>

</body>
</html>