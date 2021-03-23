<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td><a href="../addInterior">새 상품 등록</a></td>
		</tr>
		<tr>
			<th>번호</th>
			<th>분류</th>
			<th>이름</th>
			<th>이미지</th>
			<th>구성</th>
			<th>상세정보</th>
		</tr>
		<c:forEach items="${list}" var="dto" varStatus="cnt">
			<tr>
				<td>${dto.goodsNo }</td>
				<td>${dto.goodsClass }</td>
				<td>${dto.goodsName }</td>
				<td>-</td>
				<td>${dto.goodsSet }</td>
				<td>${dto.goodsDetail }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>