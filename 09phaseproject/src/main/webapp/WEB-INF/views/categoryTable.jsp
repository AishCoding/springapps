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
	<h2>Table for a specific category</h2>
	<c:set var="category_name" value="${category_name}" />
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
		<c:forEach items="${categorytable}" var="categorytable">
			<c:if test="${categorytable.category == category_name}">
				<tr>
					<td>${categorytable.username}</td>
					<td>${categorytable.category}</td>
					<td>${categorytable.productid}</td>
					<td>${categorytable.quantity}</td>
					<td>${categorytable.price}</td>
					<td>${categorytable.purchasedate}</td>
				</tr>
			</c:if>
		</c:forEach>
	</table>
</body>
</html>