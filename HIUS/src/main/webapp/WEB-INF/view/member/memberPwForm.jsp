<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="memberPwModify" method="post">
	비밀번호 : <input type="password" name="memPw" />
	<div>${err }</div><br />
	<input type="submit" value="전송" />
</body>
</html>