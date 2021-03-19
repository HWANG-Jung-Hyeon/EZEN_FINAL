<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
직원정보<br />
<table border="1">
<tr><td>아이디</td><td>${empDetail.EMP_ID }</td></tr>
<tr><td>직원번호</td><td>${empDetail.EMP_NO }</td></tr>
<tr><td>이름</td><td>${empDetail.EMP_NAME }</td></tr>
<tr><td>생년월일</td><td>${empDetail.EMP_BIRTH }</td></tr>
<tr><td>이메일</td><td>${empDetail.EMP_EMAIL }</td></tr>
<tr><td>주소</td><td>${empDetail.EMP_ADDR }</td></tr>
<tr><td>입사일</td><td>${empDetail.HIRE_DATE }</td></tr>
<tr><td>성별</td><td>${empDetail.gender }</td></tr>
<tr><td>연락처</td><td>${empDetail.EMP_PH }</td></tr>
<tr><td colspan="2" align="center">
<a href="empModify?EMP_ID=${empDetail.EMP_ID }">수정</a>
<a href="empDelete?EMP_ID=${empDetail.EMP_ID }">삭제</a>
</td></tr>
</table>
</body>
</html>