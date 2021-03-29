<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<c:forEach items="${lists }" var="dto">
<tr><td rowspan="2">예약이미지</td><td rowspan="2">렌트상품명</td><td rowspan="2">렌트날짜</td><td>렌트수량</td><td>렌트시작시간</td></tr>
<tr><td>렌트 시간</td><td>렌트 비용</td></tr>
<tr><td rowspan="2"><img src="../lent/${dto.rentGoodsImg }" /></td><td rowspan="2">${dto.rentGoodsName }</td><td rowspan="2">${dto.rentstartd }</td><td>${dto.rentstartq }</td><td>${dto.rentstarth }</td></tr>
<tr><td>${dto.rentstartt }</td><td>${dto.rentstartq * dto.rentstartt * dto.rentGoodsPrice }</td></tr>
</c:forEach>
<tr><td colspan="2"><input type="button" value ="모두 구매하기" onclick="rentOrderBuy"><input type="button" value="제품 대여로 되돌아 가기" onclick="/rent/rentmall"/></td></tr>
</table>	
</body>
</html>