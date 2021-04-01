<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="lentReviseOK" method="post" name="lR">
<table>
	<tr><td>렌트상품번호</td><td><input type="text" name="rentGoodsNo" value="${lent.rentGoodsNo }"/></td></tr>
	<tr><td>렌트상품명</td><td><input type="text" name="rentGoodsName" value="${lent.rentGoodsName }"/></td></tr>
	<tr><td>렌트상품설명</td><td><textarea rows="5" cols="30" name="rentGoodsDetail" >${lent.rentGoodsDetail }</textarea> </td></tr>
	<tr><td>렌트상품사진</td><td>이미지 수정불가->삭제후 재등록</td></tr>
	<tr><td>렌트상품수량</td><td><input type="text" name="rentGoodsQty" value="${lent.rentGoodsQty }"/></td></tr>
	<tr><td>렌트상품가격</td><td><input type="text" name="rentGoodsPrice" value="${lent.rentGoodsPrice }"/></td></tr>
	<tr><td colspan="2"><input type="submit" value="수정완료"/></td></tr>
</table>
</form>
</body>
</html>