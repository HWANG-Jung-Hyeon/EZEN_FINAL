<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
글 개수 : ${count }
<table border="1">

<tr><td>렌트상품번호:${lent.rentGoodsNo }</td><td>렌트상품명:${lent.rentGoodsName }</td></tr>
<tr><td>렌트가능 수량:${lent.rentGoodsQty }</td><td>렌트비용:${lent.rentGoodsPrice }</td></tr>
<tr><td colspan="2">렌트상품 이미지:<img src="../lent/image/${fn:replace(rent.rentGoodsImg , '`', '' )}" /></td></tr>
<tr><td colspan="2">렌트상품 설명:${lent.rentGoodsDetail }</td></tr>
	<tr><td><input type="date" /></td></tr>
</table>

<a href="lentbook?">렌트상품 예약</a>
</body>
</html>