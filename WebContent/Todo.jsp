<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Todo list</title>
</head>
<body>
	<form method="POST">
	    <br><h1>Todo List</h1><br>
		Name : <input type = "text" name = "Name">
		Description : <input type = "text" name = "Description">
		<input type="submit" value="CREATE"><br><br>
		<table style="width:100%">
 		 	<tr>
   	 			<td>id</td>
   	 			<td>Name</td>
 	   			<td>Description</td>
 			</tr>
 			<% if(request.getAttribute("task")!=null) %>
 			<tr>
 				<td><%= request.getAttribute("task") %></td>
 			</tr>
		</table> 
	</form>
</body>
</html>