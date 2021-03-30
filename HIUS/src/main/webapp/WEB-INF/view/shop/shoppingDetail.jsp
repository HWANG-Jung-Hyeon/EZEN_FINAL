<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="../js/jquery.form.js"></script>

<script type="text/javascript">
function goodsCartAdd(){
	var shopgoodsQty = document.frm.shopgoodsQty.value;
	var shopgoodsName = document.frm.shopgoodsName.value;
	var shopgoodsNo = document.frm.shopgoodsNo.value;
	var shopgoodsPrice = document.frm.shopgoodsPrice.value;
	$.ajax({
		type : "post",	
		url : "<c:url value='/shop/shopCart'/>",
		dataType : "text",
		data : {"shopgoodsNo":shopgoodsNo,"shopgoodsName" : shopgoodsName, "shopgoodsQty" : shopgoodsQty, "shopgoodsPrice" : shopgoodsPrice },
		success : function(result){
			if(result.trim()=="1"){
				if(confirm("장바구니로 가시려면 '예'를 누르시오")){
					location.href="<c:url value='/shop/shopCartList'/>";
				}
			}else{
				alert("장바구니에 담기지 않았습니다.\n다시 시도 해주세요.");
			}
		},
		error : function(){
			alert('에러가 나왔다 홀홀홀~');
			return;
		}
	});
}
</script>
</head>
<body>
	<table>
				<tr>
				<td><img src="../shopgoods/image/${fn:replace(dto.shopgoodsImage , '`', ''  )}"  width="200" height="200" /><td>
				</tr>
	</table>
	<table border="1">
	<tr><td>${dto.shopgoodsName }</td></tr>
	<tr><td>${dto.shopgoodsPrice }</td></tr>
	<tr><td>${dto.shopgoodsQty}</td></tr>
	</table>
	<form action="shopOrder" name="frm">
	<input type="hidden" name="shopgoodsNo" value="${dto.shopgoodsNo}">
	<input type="hidden" name="shopgoodsName" value="${dto.shopgoodsName }">
	<input type="hidden" name="shopgoodsPrice" value="${dto.shopgoodsPrice }">
	<table>
	<tr><td>수량<select name="shopgoodsQty">
	<c:forEach begin="1" end="${dto.shopgoodsQty }" var="i">
		<option>${i }</option>
	</c:forEach>
	</select></td></tr>
	<tr><td colspan="2"><input type="button" value="장바구니" onclick="goodsCartAdd();"><input type="submit" value="구매"></td></tr>
	</table>
	</form>
</body>
</html>