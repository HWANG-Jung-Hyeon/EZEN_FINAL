<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="shopgoodsJoinAction" name = "frm" id="frm" method = "post" enctype="multipart/form-data">
 <table width = "600" align = "center" border = 1 >
	<caption>상품 등록</caption>
    <colgroup>
        <col width = "200">
        <col width = "400">
    </colgroup>
	<tr>
 		<th >상품 번호</th>
 		<td ><input type = "text" name="shopgoodsNo" size = "12" maxlength="10" id="shopgoodsNo">
 		</td>
	</tr>
	<tr>
 		<th >상품 분류</th>
 		<td ><input type = "text" name="shopgoodsClass" size = "12" maxlength="10" id="shopgoodsClass">
 		</td>
	</tr>
	<tr>
 		<th >상품 이름</th>
 		<td ><input type = "text" name="shopgoodsName" size = "12" maxlength="10" id="shopgoodsName">
 		</td>
	</tr>
	<tr>
 		<th >상품 구성</th>
 		<td ><input type = "text" name="shopgoodsSet" size = "12" maxlength="10" id="shopgoodsSet">
 		</td>
	</tr>
	<tr>
 		<th >상품 정보</th>
 		<td ><input type = "text" name="shopgoodsDetail" size = "12" maxlength="10" id="shopgoodsDetail">
 		</td>
	</tr>
	<tr>
 		<th >상품 이미지</th>
 		<td ><input type = "file" name="shopgoodsImage" size = "12" maxlength="10" id="shopgoodsImage" multiple="multiple">
 		</td>
	</tr>
	<tr>
 		<th >상품 수량</th>
 		<td  >
 			<input type = "text" name="shopgoodsQty" size = "12" maxlength="10" id="shopgoodsQty">
 		</td>
	</tr>
	<tr>
 		<th >상품 가격</th>
 		<td ><input type = "text" name="shopgoodsPrice" size = "30" maxlength="28" id="shopgoodsPrice">
 		</td>
	</tr>
	<tr>
		<td colspan="2" align="center">
			<input type= "submit" value="등록완료"/>
			<input type= "reset" value="다시 입력"/>
			<input type= "button" value="취소"/>
		</td>
	</tr>
</table>

</form>

</body>
</html>

