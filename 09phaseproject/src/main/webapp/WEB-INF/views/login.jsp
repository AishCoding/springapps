<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" import="com.springapps.phaseproject.controller.UserController"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>
	<h1>Login</h1>

	<form action="register" method="get">
		<table>
			<tr>
				<td>Username:</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="text" name="password" /></td>
			</tr>
			<tr>
				<td />
				<td><input type="submit" value="Login" /></td>
			</tr>
		</table>
	</form>
	<form action="changePassword" method="post">
		<input type="submit" value="Click here to Change Password" />
	</form>

</body>
</html>