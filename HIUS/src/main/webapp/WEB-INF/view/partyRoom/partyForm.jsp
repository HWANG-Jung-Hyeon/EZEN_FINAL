<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="partyPro" method="post" name="frm"
		enctype="multipart/form-data" modelAttribute="PartyCommand">
		<table>
			<tr>
				<td>파티룸 위치</td>
				<td><form:input path="prPl" /> <form:errors path="prPl" /></td>
			<tr />
			<tr>
				<td>파티룸 이미지</td>
				<td><input type="file" name="prImg" multiple="multiple"/></td>
			<tr />
			<tr>
				<td>파티룸 내용</td>
				<td>
				<form:textarea rows="13" cols="56" path="prContent"> </form:textarea></td>
			<tr />
			<tr>
				<td>파티룸 최대 인원</td>
				<td><form:input path="prMax" /> <form:errors path="prMax" /></td>
			<tr>
			<tr>
				<td>파티룸 최소 이용 시간</td>
				<td><form:input path="prMintime" /> <form:errors path="prMintime" /></td>
			<tr />
			<tr>
				<td>파티룸 옵션</td>
				<td>
				<form:radiobutton path="prOp" id="prOp" value="자쿠지" checked="checked"/> 
				<form:radiobutton path="prOp" id="prOp" value="수영장" />
				<form:radiobutton path="prOp" id="prOp" value="바베큐" />
				</td>
			<tr />
			<tr>
				<td>파티룸 연락처</td>
				<td><form:input path="prPh" /> <form:errors path="prPh" id="prPh" placeholder="123-1234-1234,123-123-1234"/></td>
			<tr />
			<tr>
				<td colspan="2">
				<input type="submit" value="파티룸 등록" /> 
				<input type="reset" value="다시 작성" /> 
				<input type="button" value="메인으로" onclick="javascript:location.href=''../main'" />
			</tr>
		</table>
	</form:form>
</body>
</html>