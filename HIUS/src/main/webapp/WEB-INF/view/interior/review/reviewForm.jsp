<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../include/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HIUS :: 리뷰 작성하기</title>
</head>
<body>
	<form action="intReviewWriteAction" method="post" name="frm"
		enctype="multipart/form-data">
		<input type="hidden" name="goodsNo" value="${goods.goodsNo}" />
		<table>
			<tr>
				<th>상품명</th>
				<td>${goods.goodsName}</td>
			</tr>
			<tr>
				<th>평점</th>
				<td><input type="number" min="1" max="5" name="reviewScore" /></td>
			</tr>
			<tr>
				<th>첨부이미지</th>
				<td><input type="file" name="reviewImg" multiple="multiple"
					accept="image/*" /></td>
			</tr>
			<tr>
				<th>상세정보</th>
				<td><textarea rows="13" cols="56" name="reviewDetail"></textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="완료" />&nbsp; 
								<input type="button" value="취소" onclick="javascript:history.go(-1)" /></td>
			</tr>
		</table>
	</form>
</body>
</html>