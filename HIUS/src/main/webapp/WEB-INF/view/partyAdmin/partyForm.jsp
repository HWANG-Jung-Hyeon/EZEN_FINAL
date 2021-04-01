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
	<form action="partyJoin" method="post" name="frm"
		enctype="multipart/form-data" modelAttribute="PartyCommand">
		<table>
			<tr>
				<td>파티룸 위치</td>
				<td><input type="text" name="prPl" id="prPl" /> </td>
			<tr />
			<tr>
				<td>파티룸 이미지</td>
				<td><input type="file" name="prImg" id="prImg" multiple="multiple"/></td>
			<tr />
			<tr>
				<td>파티룸 가격</td>
				<td colspan="2"><input type="text" name="prPrice" id="prPrice"/></td><td>숫자만 입력</td>
			<tr />
			<tr>
				<td>파티룸 내용</td>
				<td>
				<textarea rows="13" cols="56" name="prContent"> </textarea>
				</td>
			<tr />
			<tr>
				<td>파티룸 최대 인원</td>
				<td><input type="text" id="prMax" name="prMax" /></td>
			<tr>
			<tr>
				<td>파티룸 최소 이용 시간</td>
				<td><input type ="text" name="prMintime" id="prMintime" /></td>
			<tr />
			<tr>
				<td>파티룸 옵션</td>
				<td>
				<input type="checkbox" name="prOp" id="prOp" value="자쿠지"/>자쿠지 
				<input type="checkbox" name="prOp" id="prOp" value="수영장" />수영장
				<input type="checkbox" name="prOp" id="prOp" value="바베큐" />바베큐
				</td>
			<tr />
			<tr>
				<td>파티룸 연락처</td>
				<td><input type="text" name="prPh" id="prPh" placeholder="123-1234-1234,123-123-1234"/></td>
			<tr />
			<tr>
				<td colspan="2">
				<input type="submit" value="파티룸 등록" /> 
				<input type="reset" value="다시 작성" /> 
			</tr>
		</table>
	<form>
</body>
</html>