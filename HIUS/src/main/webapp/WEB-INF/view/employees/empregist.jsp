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
 		<td ><input type = "text" name="EMP_ID" size = "12" maxlength="10" id="EMP_ID">
 		</td>
	</tr>
	<tr>
 		<th >비밀번호</th>
 		<td ><input type = "password" name="EMP_PW" size = "12" maxlength="10" id="EMP_PW">
 		</td>
	</tr>
	<tr>
 		<th >직원 이름</th>
 		<td ><input type = "text" name="EMP_NAME" size = "12" maxlength="10" id="EMP_NAME">
 		</td>
	</tr>
	<tr>
 		<th >직원 생년월일</th>
 		<td ><input type = "text" name="EMP_BIRTH" size = "12" maxlength="10" id="EMP_BIRTH">
 		</td>
	</tr>
	<tr>
 		<th >직원 이메일</th>
 		<td ><input type = "text" name="EMP_EMAIL" size = "12" maxlength="10" id="EMP_EMAIL">
 		</td>
	</tr>
	<tr>
 		<th >직원 주소</th>
 		<td ><input type = "text" name="EMP_ADDR" size = "12" maxlength="10" id="EMP_ADDR">
 		</td>
	</tr>
	<tr>
 		<th >성별</th>
 		<td  >
 			남자 : <input type="radio" value="M" name="Gender"  id  = "Gender" checked="checked">
 			 여자 : <input type="radio" value="F" name="Gender" id  = "Gender">
 		</td>
	</tr>
	<tr>
 		<th >직원 연락처</th>
 		<td ><input type = "text" name="EMP_PH" size = "30" maxlength="28" id="EMP_PH">
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