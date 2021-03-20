<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="MemberJoinAction" name = "frm" id="frm" method = "post">
 <table width = "600" align = "center" border = 1 >
	<caption> 등록</caption>
    <colgroup>
        <col width = "200">
        <col width = "400">
    </colgroup>
	<tr>
 		<th >회원 ID</th>
 		<td ><input type = "text" name="memId" size = "12" maxlength="10" id="memId">
 		</td>
	</tr>
	<tr>
	<tr>
 		<th >비밀번호</th>
 		<td ><input type = "password" name="memPw" size = "12" maxlength="10" id="memPw">
 		</td>
	</tr>
	<tr>
 		<th >회원 이름</th>
 		<td ><input type = "text" name="memName" size = "12" maxlength="10" id="memName">
 		</td>
	</tr>
	<tr>
 		<th >회원 생년월일</th>
 		<td ><input type = "date" name="memBirth" size = "12" maxlength="10" id="memBirth">
 		</td>
	</tr>
	<tr>
 		<th >회원 연락처</th>
 		<td ><input type = "text" name="memPh" size = "30" maxlength="28" id="memPh">
 		</td>
	</tr>
	<tr>
 		<th >회원 주소</th>
 		<td ><input type = "text" name="memAddr" size = "12" maxlength="10" id="memAddr">
 		</td>
	</tr>
	<tr>
 		<th >회원 이메일</th>
 		<td ><input type = "text" name="memEmail" size = "12" maxlength="10" id="memEmail">
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