<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
렌트상품번호:${lent.rentGoodsNo }<br/>
렌트상품명:${lent.rentGoodsName }<br/>
렌트비용:${lent.rentGoodsPrice }<br/>
렌트가능 수량:${lent.rentGoodsQty }<br/>
렌트상품 설명:${lent.rentGoodsDetail }<br/>
렌트상품 이미지:${lent.rentGoodsImg }<br/>

<a href="lentList">렌트상품 목록</a>
<a href="lentRevise?no=${lent.rentGoodsNo }">렌트상품 수정하기</a>
<a href="lentDelete?no=${lent.rentGoodsNo }">삭제하기</a>
</body>
</html>