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
상품리스트<br />
<table border="1">
<tr><td>번호</td><td>상품 번호</td><td>상품 분류</td><td>상품 이름</td><td>상품 구성</td><td>상품 정보</td><td>상품 이미지</td><td>상품 수량</td><td>상품 가격</td></tr>
<c:forEach items="${shopgoodsList}" var="dto" varStatus="shopgoodsNum">
<tr><td>${shopgoodsNum.count}</td><td><a href="shopgoodsDetail?shopgoods_no">${dto.shopgoodsNo}</a></td><td>${dto.shopgoodsClass}</td><td>${dto.shopgoodsName}</td><td>${dto.shopgoodsSet}</td><td>${dto.shopgoodsDetail}</td>
<td><img src="../shopgoods/image/${dto.shopgoodsImage}" /></td><td>${dto.shopgoodsQty}</td><td>${dto.shopgoodsPrice}</td>
</c:forEach>
</table>
</body>
</html>