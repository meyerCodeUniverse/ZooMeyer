<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="editZooDetailServlet" method="post">
Zoo Keeper: <input type="text" name="ZooKeeper" value = "${itemToEdit.zooKeeper}"><br />
Name of Zoo: <input type = "text" name="NameOfZoo" value = "${itemToEdit.name}"><br />
Open Time: <input type = "text" name="OpenTime" value = "${itemToEdit.openTime}"><br />
Close Time: <input type = "text" name="CloseTime" value = "${itemToEdit.closeTime}"><br />
<input type = "hidden" name = "id" value="${itemToEdit.ID}">
<input type = "submit" value = "Save Edited Item">
</form>
</body>
</html>