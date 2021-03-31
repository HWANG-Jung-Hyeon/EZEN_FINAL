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
<form action ="partyOrder" name="frm">

<table>
<tr><label>지점</label></tr>
<tr>
<input type="text" class="form-control" placeholder="어느 지점을 원하십니까?">
	<option value="어디서 파티를 할까요?">${dto.prPl }</option>
</tr>
<br/>
<tr><label>예약 날짜</label><tr>
<tr><td><input type="date" name="prrvDate"></td></tr>
<tr><td>CHECK-IN</td><td>CHECK-OUT</td></tr>
<tr>
<td>최소 이용시간은 4시간 입니다.
<select name="prrvStartTime">
<c:forEach begin="10:00AM" end="09:00PM" var="i">
<option>${i }</option>
</c:forEach>
</select>
</td>
<td>
<select name="prrvEndTime">
<c:forEach begin="14:00PM" end="01:00AM" var="1">
<option>${i }</option>
</c:forEach>
</select>
</td>
</tr>
<tr><label>예약 인원</label></tr>
<tr>
<select name="prMax">
<c:forEach begin="1" end="40" var="1">
<option>${i }</option>
</c:forEach>
<tr><label>이용 요금</label></tr>
<"${dto.prPrice}"}
</select>
</tr>
<tr><td><input type="submit" value="상세 정보 보기"/></td></tr>
</table>
</form>
</body>
</html> 