<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="memModifyPro" method="post" modelAttribute="memberCommand" onsubmit="submitForm()">
<form:hidden path="MEM_ID"/>
<form:hidden path="MEM_NAME"/>
<form:hidden path="MEM_BIRTH"/>
<form:hidden path="MEM_PH"/>
<form:hidden path="MEM_EMAIL"/>
<form:hidden path="GENDER"/>
<form:hidden path="NICKNAME"/>
<table width = "600" align = "center" border = 1 >
	<tr>
 		<th >회원 ID</th>
 		<td>${memCommand.MEM_ID }
 		</td>
	</tr>
	<tr>
	<tr>
 		<th >비밀번호</th>
 		<td><input type = "password" name="MEM_PW" size = "12" maxlength="10" value="${memberCommand.MEM_PW }">
 		</td>
	</tr>
	<tr>
 		<th >회원 이름</th>
 		<td>${memberCommand.MEM_NAME }
 		</td>
	</tr>
	<tr>
 		<th >회원 생년월일</th>
 		<td >
 		<fmt:formatDate value="${memberCommand.MEM_BIRTH }" type="date" pattern="yyyy-MM-dd"/>
 		</td>
	</tr>
	<tr>
 		<th >회원 연락처</th>
 		<td><input path = "text" name="MEM_PH" size = "30" maxlength="28" value="${memberCommand.MEM_PH }">
 		</td>
	</tr>
	<tr>
 		<th >회원 주소</th>
 		<td><input type = "text" name="MEM_ADDR" size = "12" maxlength="10" value="${memberCommand.MEM_ADDR }">
 		</td>
	</tr>
	<tr>
 		<th >회원 이메일</th>
 		<td><input type = "text" name="MEM_EMAIL" size = "12" maxlength="10" value="${memberCommand.MEM_EMAIL }">
 		</td>
	</tr>
	<tr>
 		<th >성별</th>
 		<td>
 		<c:when test="${memberCommand.GENDER == 'M' }">
			남자
 		</c:when>
 		<c:when test="${memberCommand.GENDER == 'F' }">
			여자
 		</c:when>
 		</td>
	</tr>
	<tr>
		<td colspan="2" align="center">
			<input type= "submit" value="정보 수정"/>
			<input type= "reset" value="다시 입력"/>
			<input type= "button" onclick="javascript:location.href='<c:url value="/"/>';"value="메인으로"/>
		</td>
	</tr>
</table>
</form:form>
</body>
</html>