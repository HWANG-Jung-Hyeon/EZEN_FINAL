<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ include file="../include/include.jsp" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	회원리스트
	<br />
	<table border="1">
		<tr>
			<td>번호</td>
			<td>회원 ID</td>
			<td>회원 이름</td>
			<td>회원 연락처</td>
		</tr>
		<c:forEach items="${memberList}" var="dto" varStatus="status">
			<tr>
				<td>${status.index + 1 }</td>
				<td><a href="memberDetail?memId=${dto.memId }">${dto.memId}</a></td>
				<td>${dto.memName }</td>
				<td>${dto.memPh }</td>
			</tr>
		</c:forEach>
		<tr>
		<td colspan="4" align="center">
			<%@ include file="../include/includePage.jsp" %>
		</td>
		</tr>
		<tr>
		<td colspan="4" align="center">
		<a href="<c:url value='/member/agree'/>">회원등록</a></td>
		</tr>
	</table>
</body>
</html>