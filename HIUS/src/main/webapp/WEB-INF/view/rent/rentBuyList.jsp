<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr><td colspan="3">결제 내역 확인</td></tr>
	<c:forEach items="${lists }" var="list">
	<tr><td colspan="3">구매 번호 : ${list.rentPayDTO.rentOrderNo }</td></tr>
	<c:forEach items="${list.lists}" var="dto">
	<tr><td rowspan="2">상품이미지 :  <img src="../lent/image/${dto.rentGoodsImg }" /></td><td >상품명 :  ${dto.rentGoodsName }</td>
		<td>고객님의 대여 수량 :  ${dto.rentStartQty }</td></tr>
	<tr><td>고객님의 대여시간 :  ${dto.rentStartT }</td><td>제품 대여요금 :  ${dto.rentGoodsPrice }</td></tr>
	</c:forEach>
	<tr><td colspan="3">총 결제 금액 : ${list.rentPayDTO.rentPaySum }</td></tr>
	<tr><td colspan="3">&nbsp;&nbsp;&nbsp;</td></tr>
	<tr><td colspan="3">&nbsp;&nbsp;&nbsp;</td></tr>
	</c:forEach>									
</table>
</body>
</html>