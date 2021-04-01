<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action ="partyOrder" name="frm">
<table>
<tr><th>지  점</th><td>${ prPl}</td></tr>
<tr><th>대여 날짜</th><td>${ prrvDate}</td></tr>
<tr><th>CHECK-IN</th><td>${ prrvStartTime}</td></tr>
<tr><th>CHECK-OUT</th><td>${ prrvEndTime}</td></tr>
<tr><th>이미지</th><td></td>${ prImg}</tr>
<tr><th>내  용</th><td></td>${ prContent}</tr>
<tr><th>인  원</th><td></td>${ prMax}</tr>
<tr><th>옵  션</th><td></td>${ prOp}</tr>
<tr><input type="button" value="결제 하기" onclick="javascript:location.href='partyOrder?prPl=${lists[0].prPl }'"></tr>
</table>
</form>
</body>
</html>