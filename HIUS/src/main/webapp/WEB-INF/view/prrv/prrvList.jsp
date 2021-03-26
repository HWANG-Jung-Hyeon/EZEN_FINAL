<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<c:forEach items="${prrvList }" var="dto">
			<td>	
				<table>
					<tr>
						<td><a href="prrvDetail?prNo=${dto.prNo}">
							<img src="../prrv/image/${fn:replace(dto.prImg , '`', ''  )}"  width="200" height="200" /></a></td>
						<tr><td>${dto.prPl }</td></tr>
						<tr><td>${dto.prPrice }</td><tr/>
					</tr>
				</table>
			</td>	
			<c:if test="${cnt.count % 3 == 0 }"></tr><tr></c:if>		
		</c:forEach>
	</tr>		
</table>
</body>
</html>
