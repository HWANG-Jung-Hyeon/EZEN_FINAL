<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="empJoinAction" name = "frm" id="frm" method = "post">
 <table width = "600" align = "center" border = 1 >
	<caption>직원 등록</caption>
    <colgroup>
        <col width = "200">
        <col width = "400">
    </colgroup>
	<tr>
 		<th >직원 ID</th>
 		<td ><input type = "text" name="empId" size = "12" maxlength="10" id="empId">
 		</td>
	</tr>
	<tr>
 		<th >비밀번호</th>
 		<td ><input type = "password" name="empPw" size = "12" maxlength="10" id="empPw">
 		</td>
	</tr>
	<tr>
 		<th >직원 이름</th>
 		<td ><input type = "text" name="empName" size = "12" maxlength="10" id="empName">
 		</td>
	</tr>
	<tr>
 		<th >직원 생년월일</th>
 		<td ><input type = "date" name="empBirth" size = "12" maxlength="10" id="empBirth">
 		</td>
	</tr>
	<tr>
 		<th >직원 이메일</th>
 		<td ><input type = "text" name="empEmail" size = "12" maxlength="10" id="empEmail">
 		</td>
	</tr>
	<tr>
 		<th >직원 주소</th>
 		<td ><input type = "text" name="empAddr" size = "12" maxlength="10" id="empAddr">
 		</td>
	</tr>
	<tr>
 		<th >성별</th>
 		<td  >
 			남자 : <input type="radio" value="M" name="gender"  id  = "gender" checked="checked">
 			 여자 : <input type="radio" value="F" name="gender" id  = "gender">
 		</td>
	</tr>
	<tr>
 		<th >직원 연락처</th>
 		<td ><input type = "text" name="empPh" size = "30" maxlength="28" id="empPh">
 		</td>
	</tr>
	<tr>
		<td colspan="2" align="center">
			<input type= "submit" value="가입완료"/>
			<input type= "reset" value="다시 입력"/>
			<input type= "button" value="취소"/>
		</td>
	</tr>
</table>

</form>

</body>
</html>