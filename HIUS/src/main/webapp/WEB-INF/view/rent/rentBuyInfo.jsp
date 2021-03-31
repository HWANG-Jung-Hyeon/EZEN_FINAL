<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="rentBuyInfo" name="frm" id="frm" method="post">
<table border="1">
<c:forEach items="${lists }" var="dto">

<tr><td rowspan="2">예약이미지</td><td rowspan="2">렌트상품명</td><td rowspan="2">렌트날짜</td><td>렌트수량</td><td>렌트시작시간</td></tr>
<tr><td>렌트 시간</td><td>렌트 비용</td></tr>
<tr><td rowspan="2"><img src="../lent/image/${dto.rentGoodsImg}" /></td>
	<td rowspan="2">${dto.rentGoodsName}</td>
	<td rowspan="2">${dto.rentStartD}</td>
	<td>${dto.rentGoodsQty}</td>
	<td>${dto.rentStartH}</td></tr>
<tr><td>${dto.rentStartT}</td><td>${dto.rentGoodsPrice}</td></tr>
</c:forEach>
<tr><td colspan="5">결제 금액 : ${lists[0].rentPay}원</td></tr>
</table>
<table border="1">
<tr><td>예약자</td><td><input type="text" name="resName"></td></tr>
<tr><td>예약자전화번호</td><td><input type="text" name="phoneNum"></td></tr>
<tr><td>결제 카드사 선택</td>
	<td><select name="cardCo">
			<option value="001">현대</option>
			<option value="002">삼성</option>
			<option value="003">롯데</option>
			<option value="004">신한</option>
			<option value="005">국민</option>
			<option value="006">하나</option>
			<option value="007">우리</option>
			<option value="008">농협</option>
			<option value="009">기업</option>
			<option value="010">씨티</option>
			<option value="011">제일</option>
			<option value="012">BC</option>
			<option value="013">외국계</option>
		</select></td>
</tr>
<tr><td>결제카드번호</td><td><input type="text" name="cardNum"></td></tr>
<tr><td colspan="2"><input type="submit" value="결제하기" /></tr>
</table>
<input type="hidden" name = "rentPay" value="${lists[0].rentPay}" />
<input type="hidden" name = "rentOrderNo" value="${lists[0].rentOrderNo}" />
</form>
</body>
</html>