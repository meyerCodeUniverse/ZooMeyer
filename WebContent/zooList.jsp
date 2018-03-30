<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="editZooServlet">
<table border=1>
<tr>
		<th></th>
		<th>Zoo Keeper</th>
		<th>Zoo</th>
		<th>Opening Time</th>
		<th>Closing Time</th>
	</tr>
<c:forEach items="${requestScope.allZoos}" var="currentzoo">
<tr>
	<td><input type="radio" name="ID" value="${currentzoo.ID}"></td>
	<td>${currentzoo.zooKeeper}</td>
	<td>${currentzoo.name}</td>
 	<td>${currentzoo.openTime}</td>
 	<td>${currentzoo.closeTime}</td>
	</tr>
</c:forEach>
</table>
<!-- <input type ="submit" value ="Edit Selected Team" name="doThisToItem"> -->
<input type ="submit" value ="Delete Selected Zoo (Zoo must be empty of animals)" name="doThisToItem">
<input type ="submit" value = "Check for animals present in Zoo" name = "doThisToItem"><br /><br />
<input type = "submit" value = "Edit Selected Zoo" name = "doThisToItem">
<input type ="submit" value ="Add New Zoo" name="doThisToItem">
</form>
<a href = "index.html">Back to Main Menu</a><br />
</body>
</html>