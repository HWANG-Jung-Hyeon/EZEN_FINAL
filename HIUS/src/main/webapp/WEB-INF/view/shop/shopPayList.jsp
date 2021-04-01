<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table width="1000" align="center">
	<c:forEach items="${shopPayList }" var="dto">
	<tr><td colspan="2">결제번호 : ${dto.shopPayDTO.shopPayNo }</td><td colspan="2">주문번호 : ${dto.shopPayDTO.orderNo }</td></tr>
		<c:forEach items="${dto.goodsList }" var="goodsList">
			<tr><td><img src='../shopgoods/image/${goodsList.goodsImg }' width='50'/>&nbsp; &nbsp; </td><td>${goodsList.goodsName }&nbsp; &nbsp; </td><td>${goodsList.goodsQty }&nbsp; &nbsp; </td><td>${goodsList.goodsPrice }&nbsp; &nbsp; </td></tr>
		</c:forEach>
	<tr><td colspan="4">결제 금액 : ${dto.shopPayDTO.shopPaysum }</td></tr>
	<tr><td colspan="4">&nbsp;&nbsp;&nbsp;&nbsp;</td></tr>
	<tr><td colspan="4">&nbsp;&nbsp;&nbsp;&nbsp;</td></tr>
	<tr><td colspan="4">&nbsp;&nbsp;&nbsp;&nbsp;</td></tr>
	</c:forEach>
</table>
</body>
</html>