<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/include.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberModify</title>
</head>
<body>
	<form action="<c:url value='/admin/memberModifyPro'/>" method="post">
		<input type="hidden" name="memId" value="${memberModify.memId }" />
		<table width="600" align="center" border=1>
			<tr>
				<th>회원 ID</th>
				<td>${memCommand.memId }</td>
			</tr>
			<tr>
			<tr>
				<th>회원 이름</th>
				<td>${memberCommand.memName }</td>
			</tr>
			<tr>
				<th>회원 생년월일</th>
				<td><fmt:formatDate value="${memberCommand.memBirth }"
						type="date" pattern="yyyy-MM-dd" /></td>
			</tr>
			<tr>
				<th>회원 연락처</th>
				<td><input path="text" name="MemPh" size="30" maxlength="28"
					value="${memberCommand.memPh }"></td>
			</tr>
			<tr>
				<th>회원 주소</th>
				<td><input type="text" name="MemAddr" size="12" maxlength="10"
					value="${memberCommand.memAddr }"></td>
			</tr>
			<tr>
				<th>회원 이메일</th>
				<td><input type="text" name="MemEmail" size="12" maxlength="10"
					value="${memberCommand.memEmail }"></td>
			</tr>
			<tr>
				<th>성별</th>
				<td>
				<c:if test="${memberCommand.gender == 'M' }">남자</c:if> 
				<c:if test="${memberCommand.gender == 'F' }">여자</c:if>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="정보 수정" /> 
					<input type="reset" value="다시 입력"  onclick = "javascript:history.back();"/> 
				</td>
			</tr>
		</table>
	</form>
</body>
</html>