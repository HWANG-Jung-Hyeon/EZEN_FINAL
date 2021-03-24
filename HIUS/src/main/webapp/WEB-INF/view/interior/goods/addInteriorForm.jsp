<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../../include/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HIUS :: 인테리어 새 상품 추가하기</title>
</head>
<body>
	<form:form action="intGoodsAddAction" method="post" name="frm"
		enctype="multipart/form-data" modelAttribute="GoodsCommand">
		<table>
			<tr>
				<th>상품번호</th>
				<td><form:input path="goodsNo" size="20" maxlength="30" />
					<form:errors path="goodsNo"/></td>
			</tr>
			<tr>
				<th>분류</th>
				<td colspan="2"><form:select path="goodsClass">
						<form:option value="묶음시공">묶음시공</form:option>
						<optgroup label="단일시공">
							<option value="철거">철거</option>
							<option value="창호">창호</option>
							<option value="설비">설비</option>
							<option value="단열/난방배관">단열/난방배관</option>
							<option value="목공">목공</option>
							<option value="목창호">목창호</option>
							<option value="전기배관/배선">전기배관/배선</option>
							<option value="타일">타일</option>
							<option value="욕실설비">욕실설비</option>
							<option value="도배/도장/필름/페인트">도배/도장/필름/페인트</option>
							<option value="마루/장판">마루/장판</option>
							<option value="조명">조명</option>
						</optgroup>
					</form:select> <form:errors path="goodsClass" /></td>
			</tr>
			<tr>
				<th>상품명</th>
				<td colspan="2"><form:input path="goodsName" size="20"
						maxlength="50" /> <form:errors path="goodsName" /></td>
			</tr>
			<tr>
				<th>상품구성</th>
				<td colspan="2"><form:input path="goodsSet" size="20" /> <form:errors
						path="goodsSet" /></td>
			</tr>
			<tr>
				<th>상세정보</th>
				<td colspan="2"><form:textarea path="goodsDetail" rows="13"
						cols="56" /> <form:errors path="goodsDetail" /></td>
			</tr>
			<tr>
				<th>이미지파일</th>
				<td><input type="file" name="goodsImg" multiple="multiple" accept="image/*" /></td>
				<td>*첫 번째 이미지는 상품 목록의 미리보기용으로 제공됩니다.</td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="상품등록" />&nbsp;<input
					type="reset" value="다시입력" />
			</tr>
		</table>
	</form:form>
</body>
</html>