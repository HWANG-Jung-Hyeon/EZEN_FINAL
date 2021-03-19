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
<form action="empModifyAction" name = "frm" id="frm" method = "post">
<input type="hidden" name="EMP_ID"  value="${empModify.EMP_ID }"/> 
<input type="hidden" name="EMP_BIRTH"  value="${empModify.EMP_BIRTH }"/> 
<table border="1">
<tr><td>아이디</td><td>${empModify.EMP_ID }</td></tr>
<tr><td>비밀번호</td><td><input type="password" name=EMP_PW value="${empModify.EMP_PW }"/></td></tr>
<tr><td>직원번호</td><td><input type="text" name=EMP_NO value="${empModify.EMP_NO }"/></td></tr>
<tr><td>이름</td><td>${empModify.EMP_NAME }</td></tr>
<tr><td>생년월일</td><td>${empModify.EMP_BIRTH } </td></tr>
<tr><td>이메일</td><td><input type="text" name=EMP_EMAIL value="${empModify.EMP_EMAIL }"/></td></tr>
<tr><td>주소</td><td><input type="text" name=EMP_ADDR value="${empModify.EMP_ADDR }"/></td></tr>
<tr><td>입사일</td><td>${empModify.HIRE_DATE }/></td></tr>
<tr><td>성별</td><td>${empModify.gender }</td></tr>
<tr><td>연락처</td><td><input type="text" name=EMP_PH value="${empModify.EMP_PH }"/></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="정보 수정"/></td></tr>
</table>
</form>
</body>
</html>