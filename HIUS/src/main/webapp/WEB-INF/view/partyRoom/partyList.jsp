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
파티룸 리스트 <br/>
파티룸 개수 : ${count }<br/>
파티룸 번호<br/>
파티룸 이미지<br/>
파티룸 위치<br/>
파티룸 가격<br/>
<c:forEach items="${list } var="dto" varStatus="cnt">
<a href="partyDetail?prNo=${dto.prNo }">${dto.prNo }</a>
	<c:forTokens items="${dto.prImg }" delims="'" var="i" begin="0" end="0">
		<img alt="" src="../partyRoom/upload/${i }" width="50px">
	</c:forTokens>
	${dto.prPl }
	<fmt:formatNumber value="${dto.prPrice }" type="currency"/></br>
<%@ include file="../include/include.jsp" %>
최소 이용 시간<br/>
최대 인원 수<br/>
<div><a href="partyForm">파티룸 등록</a></div>
</c:forEach>
</body>
</html>