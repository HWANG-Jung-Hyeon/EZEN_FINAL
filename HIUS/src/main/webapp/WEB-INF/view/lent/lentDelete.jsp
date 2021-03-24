<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/include.jsp" %>
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
	<tr><td>렌트상품번호 : ${dto.rentGoodsNo}</td><td><a href="lentDetail?no=${dto.rentGoodsNo}">상품명: ${dto.rentGoodsName}</a></td><td>상품가격: ${dto.rentGoodsPrice}</td></tr>
	<tr><td>대여가능상품수량 : ${dto.rentGoodsQty}</td><td colspan="2">상품이미지: ${dto.rentGoodsImg}</td></tr>
	</c:forEach>
</table>
<p>
<a href="lentList">렌트리스트 돌아가기</a>
<a href="lentDelete?lentno=${lent.lentno }">렌트상품 삭제</a>
</p>
</body>
</html>