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
<form action = "addMammalServlet" method = "post">
Name: <input type = "text" name = "MammalName"><br />

Weight: <input type = "text" name = "MammalWeight"><br />

Length: <input type = "text" name = "MammalLength"><br />

Height: <input type = "text" name = "MammalHeight"><br />

<label for="MammalDiet">Diet:</label>
<select name="MammalDiet">
  <c:forEach items="${requestScope.allDiets}" var="currentitem">
			<option value="${currentitem.diet}">${currentitem.diet}</option>
		</c:forEach>
</select><br />

<label for="MammalNocturnal">Nocturnal:</label>
<select name = "MammalNocturnal">
	<option>True</option>
	<option>False</option>
</select><br />

<label>Gender:</label>
				<select name="MammalGender">			
					<c:forEach items="${requestScope.allGenders}" var="currentitem">
						<option value="${currentitem.gender}">${currentitem.gender}</option>
					</c:forEach>
				</select>  <br />
				
<label for="MammalEggs">Lays Eggs:</label>
<select name = "MammalEggs">
	<option>True</option>
	<option>False</option>
</select><br />

<label for="MammalZoo">Zoo:</label>
<select name="MammalZoo">
  <c:forEach items="${requestScope.allZoos}" var="currentitem">
			<option value="${currentitem.ID}">${currentitem.name}</option>
		</c:forEach>
</select><br />

Number of Legs: <input type = "text" name = "MammalLegs"><br />

<label for="MammalBipedal">Bipedal:</label>
<select name = "MammalBipedal">
	<option>True</option>
	<option>False</option>
</select><br />

<label for="MammalFur">Fur:</label>
<select name = "MammalFur">
	<option>True</option>
	<option>False</option>
</select><br />

<input type = "submit" value = "Add Mammal">
</form>
<a href = "index.html">Back to Main Menu</a><br />
</body>
</html>