<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
글 개수 : ${count }
<table border="1">
<c:forEach items="${lists }" var="dto">
	<tr><td>렌트상품번호 : ${dto.rentGoodsNo}</td><td><a href="lentDetail?no=${dto.rentGoodsNo}">상품명: ${dto.rentGoodsName}</a></td><td rowspan="2">상품이미지: ${dto.rentGoodsImg}</td></tr>
	<tr><td>대여가능상품수량 : ${dto.rentGoodsQty}</td><td>상품가격: ${dto.rentGoodsPrice}</td></tr>
	</c:forEach>
</table>

<a href="lentRegist">렌탈상품등록</a>
</body>
</html>