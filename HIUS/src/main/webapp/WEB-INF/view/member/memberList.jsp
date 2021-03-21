<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
회원리스트<br />
<table border="1">
<tr><td>번호</td><td>회원 ID</td><td>회원 이름</td><td>회원 연락처</td></tr>
<c:forEach items="${memberList}" var="dto" varStatus="memNum">
<tr>
<td><a href="memberDetail?memId=${dto.memId }" >${memNum.count}</a></td>
<td>${dto.memId }</td>
<td>${dto.memName }</td>
<td>${dto.memPh }</td>
</tr>
</c:forEach>
</table>
</body>
</html>