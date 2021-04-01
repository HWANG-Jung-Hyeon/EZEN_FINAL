<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../js/jquery-1.8.1.min.js"></script>
<script type="text/javascript" src="../js/jquery.form.js"></script>



<script type="text/javascript">
function rentOrderAdd() {
	var rentstartd = document.frm.rentstartd.value;
	var rentstartt = document.frm.rentstartt.value;
	var rentstartq = document.frm.rentstartq.value;
	var rentstarth = document.frm.rentstarth.value;
	var rentGoodsPrice = document.frm.rentGoodsPrice.value;
	$.ajax({
		type : "post",
		url : "rentCart",
		dataType : "text",
		data : {"rentstartd" : rentstartd, "rentstartt" : rentstartt ,"rentstarth" : rentstarth , "rentstartq" : rentstartq, "rentGoodsPrice" : rentGoodsPrice, "rentGoodsNo" : ${lent.rentGoodsNo } }, 
		success : function(result){
			if(result.trim()=="1"){
				if(confirm("예약목록으로 가시려면 '예'를 누르세요")){
					location.href="rentCartList";
					}
				}else{
					alert("예약목록에 담기지 않았습니다.\n다시 시도하세요.");
				}
			},
			error : function(){
				alert('장애 발생');
				return;
			}
		});
	
}
</script>

</head>
<body>
<form action="rentOrder"  name="frm" >
<input type="hidden" name="rentGoodsNo" value="${lent.rentGoodsNo }"/>
<input type="hidden" name="rentGoodsPrice" value = "${lent.rentGoodsPrice }"/>
<table >

<tr><td>렌트상품번호:${lent.rentGoodsNo }</td><td>렌트상품명:${lent.rentGoodsName }</td></tr>
<tr><td>렌트가능 수량:${lent.rentGoodsQty }</td><td>렌트비용:${lent.rentGoodsPrice }</td></tr>
<tr><td colspan="2">렌트상품 이미지:<img src="../lent/image/${fn:replace(rent.rentGoodsImg , '`', '' )}" /></td></tr>
<tr><td colspan="2">렌트상품 설명:${lent.rentGoodsDetail }</td></tr>
	<tr><td>대여시작날짜 선택(파티룸과 예약날짜를 동일하게 설정해주세요) : <input type="date" name="rentstartd"/></td></tr>
	<tr><td>대여시작시간(파티룸과 예약시작 시간을 동일하게 설정해주세요) : <select name="rentstarth">
		<c:forEach begin="10" end="21" var="i">
		<option>${i }</option>
		</c:forEach>
	</select>
	</td></tr>
	<tr><td>대여 시간(파티룸과 동일한 최소 4시간 이상부터 예약가능합니다.) :
				<select name="rentstartt">
						<c:forEach begin="4" end="15" var="i">
						<option>${i }</option>
						</c:forEach>	
				</select>
			</td></tr>
	<tr><td>대여수량선택 : <select name="rentstartq">
						<c:forEach begin="1" end="${lent.rentGoodsQty }" var="i">
						<option>${i }</option>
						</c:forEach>	
					</select></td></tr>
<tr><td colspan="2"><input type="button" value ="장바구니" onclick="rentOrderAdd()"><input type="submit" value="대여 예약 하기"/></td></tr>
</table>
</form>
</body>
</html>