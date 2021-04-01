<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../include/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="../addInterior">새 상품 등록</a>
	<hr />
	<c:forEach items="${list}" var="dto" varStatus="cnt">
		<c:forEach items="${revScore }" var="revScore" varStatus="cnt">
			<div
				onclick="location.href='<c:url value="../interior/goodsDetail?goodsNo=${dto.goodsNo }"/>'"
				style="cursor: pointer;">
				<c:forTokens items="${dto.goodsImg }" delims=":" var="i" begin="0"
					end="0">
					<img alt="" src="../goods/upload/${i }" width="30px">
				</c:forTokens>
				<br /> ${dto.goodsName }<br />
				<c:if test="${revScore.reviewScore } == null">
				0
				</c:if>
				<c:if test="${revScore.reviewScore } != null">
				${revScore.reviewScore }
				</c:if>
				&nbsp;&nbsp;&nbsp;
				<c:if test="${revScore.reviewCount } == null">
				0
				</c:if>
				<c:if test="${revScore.reviewCount } != null">
				${revScore.reviewCount }
				</c:if>
			</div>
		</c:forEach>
	</c:forEach>
</body>
</html>