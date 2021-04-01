<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<table border="1">
	<tr><td colspan="5">주문 번호 : ${shopCartList[0].orderNo }</td></tr>
	<tr><td>리스트 번호</td><td>상품 번호</td><td>이미지</td><td>상품명</td><td>수량</td></tr>
	<c:forEach items="${shopCartList}" var="dto" >
	<tr><td>${dto.orderListNo }</td><td>${dto.shopgoodsNo }</td>
		<td><img src="../shopgoods/image/${dto.shopGoodsImg }" width="50"/></td><td>${dto.shopgoodsName }</td><td>${dto.shopgoodsQty }</td></tr>
	</c:forEach>
	<tr><td colspan="5" align="center">
<a href="shopPay">구매</a></td></tr>
	
	</table>
	
</body>
</html>