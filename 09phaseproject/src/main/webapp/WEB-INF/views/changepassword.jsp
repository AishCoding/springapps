<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Password</title>
</head>
<body>
<form action="sportyshoes" method="post">
		<table>
			<tr>
				<td>Username:</td> 
				<td><input type="text" name="username"/></td>
			</tr>
			<tr>
				<td>Old Password:</td> 
				<td><input type="text" name="password" /></td>
			</tr>
			<tr>
				<td>New Password:</td> 
				<td><input type="text" name="passwordtwo" /></td>
			</tr>
			<c:set var="username" value="${username}" />
			<c:set var="passwordtwo" value="${passwordtwo}" />
			<tr>
				<td/>
				<td><input type="submit" value="Set New Password" /></td>
			</tr>
		</table>
	</form>

</body>
</html>