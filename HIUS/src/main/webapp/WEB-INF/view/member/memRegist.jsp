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
 		<td ><input type = "text" name="MEM_ID" size = "12" maxlength="10" id="MEM_ID">
 		</td>
	</tr>
	<tr>
	<tr>
 		<th >비밀번호</th>
 		<td ><input type = "password" name="MEM_PW" size = "12" maxlength="10" id="MEM_PW">
 		</td>
	</tr>
	<tr>
 		<th >회원 이름</th>
 		<td ><input type = "text" name="MEM_NAME" size = "12" maxlength="10" id="MEM_NAME">
 		</td>
	</tr>
	<tr>
 		<th >회원 생년월일</th>
 		<td ><input type = "date" name="MEM_BIRTH" size = "12" maxlength="10" id="MEM_BIRTH">
 		</td>
	</tr>
	<tr>
 		<th >회원 연락처</th>
 		<td ><input type = "text" name="MEM_PH" size = "30" maxlength="28" id="MEM_PH">
 		</td>
	</tr>
	<tr>
 		<th >회원 주소</th>
 		<td ><input type = "text" name="MEM_ADDR" size = "12" maxlength="10" id="MEM_ADDR">
 		</td>
	</tr>
	<tr>
 		<th >회원 이메일</th>
 		<td ><input type = "text" name="MEM_EMAIL" size = "12" maxlength="10" id="MEM_EMAIL">
 		</td>
	</tr>
	<tr>
 		<th >성별</th>
 		<td  >
 			 남자 : <input type="radio" value="M" name="GENDER"  id  = "GENDER" checked="checked">
 			 여자 : <input type="radio" value="F" name="GENDER" id  = "GENDER">
 		</td>
	</tr>

	<tr>
 		<th >닉네임</th>
 		<td ><input type = "text" name="NICKNAME" size = "30" maxlength="28" id="NICKNAME">
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