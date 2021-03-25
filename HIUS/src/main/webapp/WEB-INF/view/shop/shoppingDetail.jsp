<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
				<tr>
				<td><img src="../shopgoods/image/${fn:replace(dto.shopgoodsImage , '`', ''  )}"  width="200" height="200" /><td>
				</tr>
				<tr>
					<td>${dto.shopgoodsName }</td>
				</tr>
				<tr>
					<td>${dto.shopgoodsPrice }</td>
				</tr>
	</table>
	<table border="1">
	<tr><td>상품명</td></tr>
	<tr><td>가격</td></tr>
	<tr><td>수량</td></tr>
	</table>
</body>
</html>