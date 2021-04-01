<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

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
				<div class="logo"><a href="index.html">Transitive <span>by TEMPLATED</span></a></div>
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
						 상품 갯수 : ${count }
							<table border="1">
								<c:forEach items="${list }" var="dto">
								<tr><td>상품번호 :${dto.rentGoodsNo } </td>
								    <td> 상품명: <a href="rentmallDetail?no=${dto.rentGoodsNo }">${dto.rentGoodsName }</a></td></tr>
								<tr><td colspan="2">상품이미지: <img src="../lent/image/${fn:replace(dto.rentGoodsImg , '`', '' )}" width="100" /></td></tr>
								<tr><td >상품 수량:${dto.rentGoodsQty } </td><td>상품가격 : ${dto.rentGoodsPrice }</td></tr>
								</c:forEach>
							</table>
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