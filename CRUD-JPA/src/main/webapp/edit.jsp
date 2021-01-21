<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EDIT</title>
<h1 align="center"> EDIT Record Here</h1>
</head>
<body>
<form action="update">
<table border="1" align="center">
<input type="hidden" name="uid" value="${ur.uid}">

<tr>
<td> Name :- </td>
<td><input type="text" name="name" value="${ur.name}"></td>
</tr>
<tr>
<td> Username :- </td>
<td><input type="text" name="username" value="${ur.username}"></td>
</tr>
<tr>
<td>Password :-</td>
<td><input type="text" name="password" value="${ur.password}"></td>
</tr>
<tr>
<td>Mobile</td>
<td><input type="text" name="mobile" value="${ur.mobile }"></td>
</tr>
<tr>
<td><input type="submit" value="UPDATE"></td>
</tr>
</table>
</form>
</body>
</html>