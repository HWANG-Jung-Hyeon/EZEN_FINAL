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
파티룸
파티룸 가격 : <fmt:formatNumber value="${partyCommand.prPrice }" type="currency" /><br/>
파티룸 설명 : ${fn:replace(partyCommand.prContent,cn,br) }<br />
<c:forTokens items="${partyCommand.prImg}" delims="'" var="img">
	<img src="../partyRoom/upload/${img }" width="50" height="50"/><br/>
</c:forTokens>
최소 이용 시간: ${partyCommand.prMintime}<br/>
최대 인원 : ${partyCommand.prMax}<br/>
옵션 : ${partyCommand.prOp }<br/>
파티룸 연락처 : ${partyCommand.prPh }<br/>
<p>
<a href="partyList">파티룸 목록</a>
<a href="goodsDelete?prNo=${party.prNo }">파티룸 삭제</a>
<a href="goodsModify?prNo=${party.prNo }">파티룸 수정</a>
</p>
</body>
</html>