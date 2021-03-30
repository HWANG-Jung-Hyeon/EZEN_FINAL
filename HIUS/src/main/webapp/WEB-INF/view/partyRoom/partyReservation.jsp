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
아이디 : ${partyCartDTO.memberDTO.memId }<br />
이름 : ${partyCartDTO.memberDTO.memName }<br />
주소 : ${partyCartDTO.memberDTO.memAddr }<br />
연락처 : ${partyCartDTO.memberDTO.memPh }<br />
<table >
<tr><th>예약번호</th><td></td></tr>
<tr><th>지점</th></tr><td>${dto.prPl}</td></tr>
<tr><th>예약날짜</th></tr><td>${dto.prrvDate }</td></tr>
<tr><th>Check-In</th><tr><td>${dto.prrvStartTime }</td></tr>
<tr><th>Check-Out</th></tr><td>${dto.prrvEndTime }</td></tr>
</table>
<input type="button" value="결제 하기">
</body>
</html>