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
 <table width="600" align ="center" border="1">
	<caption>파티룸 상세정보</caption>
	<tr><th>파티룸 위치(지점)</th><td>${partyCommand.prPl }</td></tr>
	<tr><th>파티룸 이미지</th><td>
	<c:forTokens items="${partyCommand.prImg}" delims="'" var="img">
		<img src="../partyAdmin/upload/${img } width="50" height="50"/>
	</c:forTokens>	
	</td></tr>
	<tr><th>파티룸 내용</th><td>${fn:replace(partyCommand.prContent,cn,br) }</td></tr>
	<tr><th>파티룸 가격</th><td><fmt:formatNumber value="${partyCommand.prPrice }" type="currency"></fmt:formatNumber></td></tr>
	<tr><th>최대 이용 인원</th><td>${partyCommand.prMax }</td></tr>
	<tr><th>최소 이용 시간</th><td>${partyCommand.prMintime }</td></tr>
	<tr><th>옵션</th><td>${partyCommand.prOp }</td></tr>
	<tr><th>파티룸전화번호</th><td>{partyCommand.prPh</td></tr>
	<td>
</td>
</tr>
<tr><td colspan="2" align="center">
<a href="partyModify?prPl"=${partyCommand.prPl }">수  정</a>
<a href="partyDelete?prPl=${partyCommand.prPl }">삭  제</a>
<a href="partyList">파티룸 목록</a>
</td></tr>	
</table>
</body>
</html>