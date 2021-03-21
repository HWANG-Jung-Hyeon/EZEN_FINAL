<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="memberPwModifyPro" method="post" name="frm" 
			modelAttribute="memberPwCommand">
	 현재 비밀번호 : <input type="password" name="oldPw" />
	 			<form:errors path ="oldPw"/>
	 <br />
	 바꿀 비밀번호 : <input type="password" name="newPw" />
	 			<form:errors path = "newPw"/><br />
	 비밀번호 확인 : <input type="password" name="newPwCon" />
	 			<form:errors path = "newPwCon"/><br />
	 <input type="submit" value="전송" />
</form:form>
</body>
</html>