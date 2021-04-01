<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML>
<!--
	Transitive by TEMPLATED
	templated.co @templatedco
	Released for free under the Creative Commons Attribution 3.0 license (templated.co/license)
-->
<html>
	<head>
		<title>Generic - Transitive by TEMPLATED</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="../assets/css/main.css" />
	</head>
	<body class="subpage">

		<!-- Header -->
			<header id="header">
				<div class="logo"><a href="../main">Transitive <span>by TEMPLATED</span></a></div>
				<a href="#menu" class="toggle"><span>Menu</span></a>
			</header>

		<!-- Nav -->
			<nav id="menu">
				<ul class="links">
					<li><a href="../main">Home</a></li>
					<li><a href="<c:url value='/login/logout'/>">로그 아웃</a><br /></li>
					<li><a href="admin/memberList">회원 리스트</a><br/></li>
					<li><a href="employees/empRegist">직원 등록</a><br/></li>
					<li><a href="employees/empList">직원 리스트 </a><br/></li>
					<li><a href="shopgoods/shopgoodsRegist">상품 등록 </a><br/></li>
					<li><a href="shopgoods/shopgoodsList">상품 리스트 </a><br/></li>
					<li><a href="partyRoom/partyForm">파티룸 등록</a><br/></li>
					<li><a href="partyRoom/partyList">파티룸 리스트</a><br/></li>
				</ul>
			</nav>

		<!-- One -->
			<section id="one" class="wrapper style2">
				<div class="inner">
					<div class="box">
						<div class="image fit">
							<img src="../images/pic01.jpg" alt="" />
						</div>
						<div class="content">
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
	<tr><td>대여수량선택 :<select name="rentstartq">
						<c:forEach begin="1" end="${lent.rentGoodsQty }" var="i">
						<option>${i }</option>
						</c:forEach>	
					</select></td></tr>
<tr><td colspan="2"><input type="button" value ="장바구니" onclick="rentOrderAdd()"><input type="submit" value="대여 예약 하기"/></td></tr>
</table>
</form>	
						</div>
					</div>
				</div>
			</section>

		<!-- Four -->
			<section id="four" class="wrapper style3">
				<div class="inner">

					<header class="align-center">
						<h2>Morbi interdum mollis sapien</h2>
						<p>Cras aliquet urna ut sapien tincidunt, quis malesuada elit facilisis. Vestibulum sit amet tortor velit. Nam elementum nibh a libero pharetra elementum. Maecenas feugiat ex purus, quis volutpat lacus placerat malesuada. Praesent in sem ex. Morbi mattis sapien pretium tellus venenatis, at egestas urna ornare.</p>
					</header>

				</div>
			</section>

		<!-- Scripts -->
			<script src="../assets/js/jquery.min.js"></script>
			<script src="../assets/js/jquery.scrolly.min.js"></script>
			<script src="../assets/js/jquery.scrollex.min.js"></script>
			<script src="../assets/js/skel.min.js"></script>
			<script src="../assets/js/util.js"></script>
			<script src="../assets/js/main.js"></script>

	</body>
</html>