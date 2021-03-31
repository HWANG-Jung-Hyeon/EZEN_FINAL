<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
구매번호 : ${dto.orderNo }
카드 번호 : ${dto.shopPaymet }
결제 금액 : ${dto.shopPaysum }
이 정상처리되었습니다.<br />
<a href="shopPayList">구매내역확인</a><br />
<a href="shoppingmall">쇼핑몰</a>
</body>
</html>