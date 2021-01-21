<%@page import="com.cjc.main.model.User"%>

<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>
<script type="text/javascript">

function updateRecord()
{
	alert("Do you want to Update Data?");
	document.myform.action="edit";
	document.myform.submit();
}

function deleteRecord()
{
	alert("Do you want to Delete Data?");
	document.myform.action="delete";
	document.myform.submit();
}
function addRecord()
{
	alert("Add Data");
	document.myform.action="add";
	document.myform.submit();
}
</script>
</head>
<body>
<form name="myform">
<table border="1" align="center">
<tr>
<th>Select</th>
<th>Customer ID</th>
<th>Name</th>
<th>Username</th>
<th>Password</th>
<th>Mobile</th>

</tr>

<%List<User> ulist=(List<User>)request.getAttribute("data");
for(User u:ulist)
{
%>
<tr>
<td><input type="radio" name="uid" value="<%=u.getUid() %>"></td>
<td><%=u.getUid() %></td>
<td><%=u.getName() %></td>
<td><%=u.getUsername() %></td>
<td><%=u.getPassword() %></td>
<td><%=u.getMobile() %></td>

</tr>
<%}%>
<tr>
<td><input type="button" value="Delete" onclick="deleteRecord()"></td>
<td><input type="button" value="Update" onclick="updateRecord()"></td>
<td><input type="button" value="Add" onclick="addRecord()"></td>

</tr>
</table>
</form>
</body>
</html>