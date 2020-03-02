<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Validation product</title>
</head>
<body>
	<div>
		<h1>${message}</h1>
	</div>
	<div>
		<c:forEach items="${listing}" var="pr">
		<h2> ${pr.idProduit } </h2><br>
		<h2> ${pr.nomProduit } </h2><br>
		<h2> ${pr.description } </h2><br>
		</c:forEach>
	</div>
</body>
</html>