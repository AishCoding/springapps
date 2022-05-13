<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" import="com.springapps.phaseproject.entity.User, java.util.List"  %>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>
	<h1>User Registration</h1>
	<form action="registeruser" method="post">
		<table>
			<tr>
				<td>Purchase Id:</td> 
				<td><input type="text" name="productid" /></td>
			</tr>
			<tr>
				<td>Username:</td> 
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>Category:</td> 
				<td><input type="text" name="category" /></td>
			</tr>
			<tr>
				<td>Quantity:</td> 
				<td><input type="text" name="quantity" /></td>
			</tr>
			<tr>
				<td>Price:</td> 
				<td><input type="text" name="price" /></td>
			</tr>
			<tr>
				<td>Purchase Date:</td> 
				<td><input type="text" name="purchasedate" /></td>
			</tr>
			<tr>
				<td/>
				<td><input type="submit" value="Register" /></td>
			</tr>
		</table>
	</form>
	
	<p>${result}</p>
	
	<ul>	
		<c:forEach items="${users}" var="user">
			<li>${user.username} | ${user.category} | ${user.productid} | ${user.quantity} | ${user.price} | ${user.purchasedate}</li>
		</c:forEach>
	</ul>
	
	<form action="userTable" method="post">
		Enter the name of the user : <input type = "text" name = "user_name"/>
		<input type="submit" value="Search by Users"/> <br/>
	</form>

	</br>
	
	<form action="categoryTable" method="post">
		Enter the category : <input type = "text" name = "category_name"/>
		<input type="submit" value="Search by Category"/>
	</form>
	
	</br>
	
	<form action="dateTable" method="post">
		Enter the date : <input type = "text" name = "date_name"/>
		<input type="submit" value="Search by Date"/>
	</form>
	
</body>
</html>