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
<th>파티룸 개수 : ${count }</th>
<table>
<tr>
<th>파티룸 지점 </th>
<th>파티룸 이미지 </th>
<th>파티룸 가격 </th>
<tr>
<c:forEach items="${list } var="dto" varStatus="cnt">
<tr>
<td><a href="partyDetail?prPl=${dto.prPl }">${dto.prPl }</a></td>
<td><c:forTokens items="${dto.prImg }" delims="'" var="i" begin="0" end="0">
		<img alt="" src="../partyRoom/upload/${i }" width="50px">
	</c:forTokens></td>	
<td><fmt:formatNumber value="${dto.prPrice }" type="currency"/></td>
<%@ include file="../include/include.jsp" %>
</tr>
<tr><td colspan="3">
</c:forEach>
</table>
</body>
</html>