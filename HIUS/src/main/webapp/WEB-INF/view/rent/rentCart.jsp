<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<tr><td colspan="3">예약내역 확인</td></tr>
	<tr><td>렌트상품번호 : ${dto.rentGoodsNo}</td><td><a href="lentDetail?no=${dto.rentGoodsNo}">상품명: ${dto.rentGoodsName}</a></td><td rowspan="2">상품이미지: ${dto.rentGoodsImg}</td></tr>
	<tr><td>고객님의 대여 수량 : </td><td>고객님의 대여시간 : </td><td>제품 대여요금 : </td></tr>
	
	<tr><td colspan="3">총 대여여금 :</td></tr>
</body>
</html>