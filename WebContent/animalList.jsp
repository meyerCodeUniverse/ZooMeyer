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
<form method="post" action="editAnimalServlet">
<table border=1>
	<tr>
		<th></th>
		<th>Name</th>
		<th>Zoo</th>
		<th>Weight</th>
		<th>Length</th>
		<th>Height</th>
		<th>Diet</th>
		<th>Nocturnal</th>
		<th>Gender</th>
		<th>Lays Eggs</th>
		<th>Number of Legs</th>
		<th>Bipedal</th>
		<th>Has Fur</th>
		<th>Has Legs</th>
		<th>Skin Type</th>
		<th>Venomous</th>
	</tr>
<c:forEach items="${requestScope.allAnimals}" var="currentanimal">
<tr>
	<td><input type="radio" name="ID" value="${currentanimal.ID}"></td>
	<td>${currentanimal.name}</td>
	<td>${currentanimal.zoo_id.name}</td>
 	<td>${currentanimal.weight}</td>
 	<td>${currentanimal.length}</td>
 	<td>${currentanimal.height}</td>
 	<td>${currentanimal.diet}</td>
 	<td>${currentanimal.nocturnal}</td>
 	<td>${currentanimal.gender}</td>
 	<td>${currentanimal.laysEggs}</td>
 	<c:choose>
		<c:when test="${currentanimal.animal_id == 1}">
			<td>${currentanimal.numOfLegs}</td>
			<td>${currentanimal.bipedal}</td>
			<td>${currentanimal.hasFur}</td>
			<td>N/A</td>
			<td>N/A</td>
			<td>N/A</td>
		</c:when>
		<c:otherwise>
			<td>N/A</td>
			<td>N/A</td>
			<td>N/A</td>
			<td>${currentanimal.hasLegs}</td>
			<td>${currentanimal.skinType}</td>
			<td>${currentanimal.venomous}</td>
		</c:otherwise>
	</c:choose>
</tr>
</c:forEach>
</table>
<!-- <input type ="submit" value ="Edit Selected Team" name="doThisToItem"> -->
<input type ="submit" value ="Delete Selected Animal" name="doThisToItem">
<input type = "submit" value = "Edit Selected Animal" name = "doThisToItem">
</form>
<a href = "index.html">Back to Main Menu</a><br />
</body>
</html>