<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쇼핑몰</title>
</head>
<body>
	<table>
	<tr>
	<c:forEach items="${shopMain}" var="dto" varStatus="cnt">
		<td>
			<table>
				<tr>
				<td><a href="shoppingmallDetail?shopgoodsNo=${dto.shopgoodsNo}"><img src="../shopgoods/image/${fn:replace(dto.shopgoodsImage , '`', ''  )}"  width="200" height="200" /></a><td>
				</tr>
				<tr>
					<td>${dto.shopgoodsName }</td>
				</tr>
				<tr>
					<td>${dto.shopgoodsPrice }</td>
				</tr>
			</table>
		</td>
		<c:if test="${cnt.count % 3 == 0 }"></tr><tr></c:if>
	</c:forEach>	
	</tr>
	</table>
	
</body>
</html>