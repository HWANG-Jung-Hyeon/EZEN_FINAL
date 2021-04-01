<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ include file="../include/include.jsp" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<c:forEach items=${partyList }" var="dto">
			<td>	
				<table>
					<tr><td>${dto.prPl }</td></tr>
					<tr>
						<td><a href="partyDetail?prPl=${dto.prPl}">
							<img src="../partyAdmin/image/${fn:replace(dto.prImg , '`', ''  )}"  width="200" height="200" /></a></td>
						<tr><td>${dto.prPrice }원</td><tr/>
					</tr>
				</table>
			</td>	
			<c:if test="${cnt.count % 2 == 0 }"></tr><tr></c:if>		
		</c:forEach>
	</tr>
	<td><a href="partyForm">파티룸 등록</a></td>		
</table>
</body>
</html>
