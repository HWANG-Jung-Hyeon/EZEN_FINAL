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
<tr><td>아이디</td><td>${empDetail.empId }</td></tr>
<tr><td>직원번호</td><td>${empDetail.empNo }</td></tr>
<tr><td>이름</td><td>${empDetail.empName }</td></tr>
<tr><td>생년월일</td><td>${empDetail.empBirth }</td></tr>
<tr><td>이메일</td><td>${empDetail.empEmail }</td></tr>
<tr><td>주소</td><td>${empDetail.empAddr }</td></tr>
<tr><td>입사일</td><td>${empDetail.hireDate }</td></tr>
<tr><td>성별</td><td>${empDetail.gender }</td></tr>
<tr><td>연락처</td><td>${empDetail.empPh }</td></tr>
<tr><td colspan="2" align="center">
<a href="empModify?emp_id=${empDetail.empId }">수정</a>
<a href="empDelete?emp_id=${empDetail.empId }">삭제</a>
</td></tr>
</table>
</body>
</html>