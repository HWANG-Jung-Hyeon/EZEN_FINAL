<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
직원정보<br />
<table border="1">
<tr><td>아이디</td><td><input type="text" name=empId value="${empDatail.EMP_ID }"/></td></tr>
<tr><td>비밀번호</td><td><input type="text" name=empPw value="${empDatail.EMP_PW }"/></td></tr>
<tr><td>직원번호</td><td><input type="text" name=empNo value="${empDatail.EMP_NO }"/></td></tr>
<tr><td>이름</td><td><input type="text" name=EMP_NAME value="${empDatail.EMP_NAME }"/></td></tr>
<tr><td>생년월일</td><td><input type="text" name=EMP_BIRTH value="${empDatail.EMP_BIRTH }"/></td></tr>
<tr><td>이메일</td><td><input type="text" name=EMP_EMAIL value="${empDatail.EMP_EMAIL }"/></td></tr>
<tr><td>주소</td><td><input type="text" name=EMP_ADDR value="${empDatail.EMP_ADDR }"/></td></tr>
<tr><td>입사일</td><td><input type="text" name=HIRE_DATE value="${empDatail.HIRE_DATE }"/></td></tr>
<tr><td>성별</td><td><input type="text" name=gender value="${empDatail.gender }"/></td></tr>
<tr><td>연락처</td><td><input type="text" name=EMP_PH value="${empDatail.EMP_PH }"/></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="정보 수정"/></td></tr>
</table>
</body>
</html>