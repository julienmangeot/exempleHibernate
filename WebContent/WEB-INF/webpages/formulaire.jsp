<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>New product</title>
</head>
<body>
	<form action="/ExempleHibernate/add" method="post">
		<div>
			<label>Product name</label>
			<input type="text"  name="name" placeholder="introduce the product name">
		</div>
		<div>
			<label>Product description</label>
			<textarea name="description" placeholder="introduce the product name"></textarea>
		</div>
		<div>
			<input type="submit" name="valider" value="save product">
		</div>
	</form>
</body>
</html>