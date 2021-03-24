<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<td>
		<a href="partyDetail/${dto.prNo }">
		<c:forTokens items="${dto.prImg }"
			delims="'" var="i" begin="0" end="0">
			<img alt="" src="../partyRoom/upload/${i }" />	
		</c:forTokens><br/>
		${dto.prPl }
		</a>
	</td>
  <c:if test="${cnt.count % 4 == 0 }">
  	</tr><tr>
  </c:if>	
</c:forEach>
</body>
</html>