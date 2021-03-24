<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/include.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="memberJoin" name = "frm" id="frm" method = "post" modelAttribute="memberCommand">
 <table width = "600" align = "center" border = 1 >
	<caption> 등록</caption>
    <colgroup>
        <col width = "200">
        <col width = "400">
    </colgroup>
	<tr>
 		<th >회원 ID</th>
 		<td ><form:input path ="memId" name="memId" id="memId"/>
 			 <form:errors path="memId"/>
 		</td>
	</tr>
	<tr>
	<tr>
 		<th >비밀번호</th>
 		<td >
 		<form:password path ="memPw" size = "12" maxlength="10" id="memPw"/>
 		<form:errors path="memPw"/>
 		</td>
	</tr>
	<tr>
 		<th >회원 이름</th>
 		<td >
 		<form:input path = "memName" size = "12" maxlength="10" id="memName"/>
 		<form:errors path="memName"/>
 		</td>
	</tr>
	<tr>
 		<th >회원 생년월일</th>
 		<td >
 		<input type = "date" name="memBirth" size = "12" maxlength="10" id="memBirth"/>
 		<form:errors path="memBirth"/>
 		</td>
	</tr>
	<tr>
 		<th >회원 연락처</th>
 		<td >
 		<form:input path ="memPh" size = "15" maxlength="13" id="memPh"/>
 		<form:errors path="memPh"/>
 		</td>
	</tr>
	<tr>
 		<th >회원 주소</th>
 		<td >
 		<form:input path="memAddr" id="memAddr"/>
 		<form:errors path="memAddr"/>
 		</td>
	</tr>
	<tr>
 		<th >회원 이메일</th>
 		<td >
 		<form:input path="memEmail" size = "30" maxlength="30" id="memEmail"/>
 		<form:errors path="memEmail"/>
 		</td>
	</tr>
	<tr>
 		<th >성별</th>
 		<td  >
 			 남자 : <form:radiobutton path="gender"  id  = "gender" value="m" checked="checked"/>
 			 여자 : <form:radiobutton path="gender"  id="gender" value="F" />
 		</td>
	</tr>
	<tr>
		<td colspan="2" align="center">
			<input type= "submit" value="가입완료"/>
			<input type= "reset" value="다시 입력"/>
			<input type= "button" value="메인으로" onclick="javascript:location.href='../main'"/ >
		</td>
	</tr>
</table>
</form:form>
</body>
</html>