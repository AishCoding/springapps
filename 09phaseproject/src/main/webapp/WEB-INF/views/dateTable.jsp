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
	<h2>Table for a specific date</h2>
	<c:set var="date_name" value="${date_name}" />
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
		<c:forEach items="${datetable}" var="datetable">
			<c:if test="${datetable.purchasedate == date_name}">
				<tr>
					<td>${datetable.username}</td>
					<td>${datetable.category}</td>
					<td>${datetable.productid}</td>
					<td>${datetable.quantity}</td>
					<td>${datetable.price}</td>
					<td>${datetable.purchasedate}</td>
				</tr>
			</c:if>
		</c:forEach>
	</table>

</body>
</html>