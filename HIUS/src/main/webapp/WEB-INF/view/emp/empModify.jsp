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
<input type="hidden" name="empId"  value="${empModify.empId }"/> 
<input type="hidden" name="empBirth"  value="${empModify.empBirth }"/> 
<table border="1">
<tr><td>아이디</td><td>${empModify.empId }</td></tr>
<tr><td>비밀번호</td><td><input type="password" name=emp_pw value="${empModify.empPw }"/></td></tr>
<tr><td>직원번호</td><td><input type="text" name=emp_no value="${empModify.empNo }"/></td></tr>
<tr><td>이름</td><td>${empModify.empName }</td></tr>
<tr><td>생년월일</td><td>${empModify.empBirth } </td></tr>
<tr><td>이메일</td><td><input type="text" name=emp_email value="${empModify.empEmail }"/></td></tr>
<tr><td>주소</td><td><input type="text" name=emp_addr value="${empModify.empAddr }"/></td></tr>
<tr><td>입사일</td><td>${empModify.hireDate }/></td></tr>
<tr><td>성별</td><td>${empModify.gender }</td></tr>
<tr><td>연락처</td><td><input type="text" name=emp_ph value="${empModify.empPh }"/></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="정보 수정"/></td></tr>
</table>
</form>
</body>
</html>