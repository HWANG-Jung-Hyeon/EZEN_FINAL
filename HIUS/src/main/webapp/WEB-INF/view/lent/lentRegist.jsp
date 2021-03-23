<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="lentRegistOK" method="post"  name="frm" enctype="multipart/form-data">
<table>
	<tr><td>렌트상품번호</td><td><input type="text" name="rentGoodsNo"/></td></tr>
	<tr><td>렌트상품명</td><td><input type="text" name="rentGoodsName"/></td></tr>
	<tr><td>렌트상품설명</td><td><textarea rows="5" cols="30" name="rentGoodsDetail">
	</textarea> </td></tr>
	<tr><td>렌트상품사진</td><td><input type="file" name="rentGoodsImg" multiple="multiple"/></td></tr>
	<tr><td>렌트상품수량</td><td><input type="text" name="rentGoodsQty"/></td></tr>
	<tr><td>렌트상품가격</td><td><input type="text" name="rentGoodsPrice"/></td></tr>
	<tr><td colspan="2"><input type="submit" value="전송"/></td></tr>
</table>
</body>
</html>