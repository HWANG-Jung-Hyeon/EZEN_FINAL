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
<tr><td>번호</td><td>회원번호</td><td>회원 ID</td><td>회원 이름</td></tr>
<c:forEach items="${memList}" var="dto" varStatus="memNum">
<tr><td>${memNum.count }</td>
<td><a href="memDetail?MEM_ID=${dto.MEM_ID }" >${dto.MEM_NO }</a></td>
<td>${dto.MEM_ID }</td>
<td>${dto.MEM_NAME }</td></tr>
</c:forEach>
</table>
</body>
</html>