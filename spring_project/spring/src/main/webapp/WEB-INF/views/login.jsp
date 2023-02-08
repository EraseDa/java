<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
	<title>Login</title>
</head>
<body>

<form action="/spring/login" method="post">
	<label>아이디 : </label><input type="text" name="id"> <br>
	<label>비밀번호 : </label><input type="password" name="pw"> <br>
	<button>전송</button>
</form>
</body>
</html>
