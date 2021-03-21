<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="memberModifyPro" method="post" onsubmit="submitForm()">
<input type="hidden" name="memId" value="${memberModify.memId }"/>
<input type="hidden" name="memBirth" value="${memberModify.memBirth }"/>
<table width = "600" align = "center" border = 1 >
	<tr>
 		<th >회원 ID</th>
 		<td>${memCommand.MEMId }
 		</td>
	</tr>
	<tr>
	<tr>
 		<th >비밀번호</th>
 		<td><input type = "password" name="memPw" size = "12" maxlength="10" value="${memberCommand.MemPw }">
 		</td>
	</tr>
	<tr>
 		<th >회원 이름</th>
 		<td>${memberCommand.memName }
 		</td>
	</tr>
	<tr>
 		<th >회원 생년월일</th>
 		<td >
 		<fmt:formatDate value="${memberCommand.memBirth }" type="date" pattern="yyyy-MM-dd"/>
 		</td>
	</tr>
	<tr>
 		<th >회원 연락처</th>
 		<td><input path = "text" name="MemPh" size = "30" maxlength="28" value="${memberCommand.MemPh }">
 		</td>
	</tr>
	<tr>
 		<th >회원 주소</th>
 		<td><input type = "text" name="MemAddr" size = "12" maxlength="10" value="${memberCommand.MemAddr }">
 		</td>
	</tr>
	<tr>
 		<th >회원 이메일</th>
 		<td><input type = "text" name="MemEmail" size = "12" maxlength="10" value="${memberCommand.MemEmail }">
 		</td>
	</tr>
	<tr>
 		<th >성별</th>
 		<td>
 		<c:when test="${memberCommand.gender == 'M' }">
			남자
 		</c:when>
 		<c:when test="${memberCommand.gender == 'F' }">
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
</form>
</body>
</html>