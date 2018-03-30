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
<form action = "addReptileServlet" method = "post">
Name: <input type = "text" name = "ReptileName"><br />

Weight: <input type = "text" name = "ReptileWeight"><br />

Length: <input type = "text" name = "ReptileLength"><br />

Height: <input type = "text" name = "ReptileHeight"><br />

<label for="ReptileDiet">Diet:</label>
<select name="ReptileDiet">
  <c:forEach items="${requestScope.allDiets}" var="currentitem">
			<option value="${currentitem.diet}">${currentitem.diet}</option>
		</c:forEach>
</select><br />

<label for="ReptileNocturnal">Nocturnal:</label>
<select name = "ReptileNocturnal">
	<option>True</option>
	<option>False</option>
</select><br />

<label>Gender:</label>
				<select name="ReptileGender">			
					<c:forEach items="${requestScope.allGenders}" var="currentitem">
						<option value="${currentitem.gender}">${currentitem.gender}</option>
					</c:forEach>
				</select>  <br />
				
<label for="ReptileEggs">Lays Eggs:</label>
<select name = "ReptileEggs">
	<option>True</option>
	<option>False</option>
</select><br />

<label for="ReptileZoo">Zoo:</label>
<select name="ReptileZoo">
  <c:forEach items="${requestScope.allZoos}" var="currentitem">
			<option value="${currentitem.ID}">${currentitem.name}</option>
		</c:forEach>
</select><br />

<label for="ReptileLegs">Legs:</label>
<select name = "ReptileLegs">
	<option>True</option>
	<option>False</option>
</select><br />

<label for="ReptilePoisonous">Poisonous:</label>
<select name = "ReptilePoisonous">
	<option>True</option>
	<option>False</option>
</select><br />

<label for="ReptileSkin">Skin:</label>
<select name="ReptileSkin">
  <c:forEach items="${requestScope.allSkins}" var="currentitem">
			<option value="${currentitem.skin}">${currentitem.skin}</option>
		</c:forEach>
</select><br />

<input type = "submit" value = "Add Reptile">
</form>
<a href = "index.html">Back to Main Menu</a><br />
</body>
</html>