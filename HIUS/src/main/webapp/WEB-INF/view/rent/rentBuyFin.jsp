<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${dto.rentOrderNo }번의 결제 금액 ${dto.rentPaySum }이 정상적으로 결제 되었습니다.

<tr><td><input type="button" value="결제내역 확인" onclick="rent/rentBuyList"/>
</body>
</html>