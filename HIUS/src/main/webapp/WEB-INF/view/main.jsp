<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="include/include.jsp" %> 
<!DOCTYPE HTML>
<!--
	Transitive by TEMPLATED
	templated.co @templatedco
	Released for free under the Creative Commons Attribution 3.0 license (templated.co/license)
-->
<html>
	<head>
		<title>Transitive by TEMPLATED</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="assets/css/main.css" />
	</head>
	<body>

		<!-- Header -->
			<header id="header" class="alt">
				<div class="logo"><a href="main">Transitive <span>by TEMPLATED</span></a></div>
				<a href="#menu" class="toggle"><span>Menu</span></a>
			</header>

		<!-- Nav -->
			<nav id="menu">
				<ul class="links">
					<c:if test="${!empty authInfo }">
						<c:if test="${authInfo.grade == 'mem' }">
							<li><a href="<c:url value='/login/logout'/>">로그 아웃</a></li>
							<li><a href="member/memberInfo">내 정보</a></li>
							<li><a href="shop/shoppingmall">쇼핑몰</a></li>
							<li><a href="rent/rentmall">제품 대여</a></li>
							<li><a href="partyRoom/partyInfo">파티룸 예약</a></li>
							
						</c:if>
						<c:if test="${authInfo.grade == 'emp' }">
							<li><a href="<c:url value='/login/logout'/>">로그 아웃</a></li>
							<li><a href="admin/memberList">회원 리스트</a></li>
							<li><a href="employees/empRegist">직원 등록</a></li>
							<li><a href="employees/empList">직원 리스트 </a></li>
							<li><a href="shopgoods/shopgoodsRegist">상품 등록 </a></li>
							<li><a href="shopgoods/shopgoodsList">상품 리스트 </a></li>
							<li><a href="partyRoom/partyForm">파티룸 등록</a></li>
							<li><a href="partyRoom/partyList">파티룸 리스트</a></li>
							<li><a href="emp/empInfo">내 정보</a></li>
						</c:if>
					</c:if>
				</ul>
			</nav>

		<!-- Banner -->
		<!--
			To use a video as your background, set data-video to the name of your video without
			its extension (eg. images/banner). Your video must be available in both .mp4 and .webm
			formats to work correctly.
		-->
			<section id="banner" data-video="images/video">
				<div class="inner">
				<c:if test="${empty authInfo }">
					<h1>로그인</h1>
				</c:if>
				<c:if test="${!empty authInfo }">
					<h1>로그인 완료.</h1>
				</c:if>	
				</div>	
			</section>

		<!-- One -->
			<section id="one" class="wrapper style2">
				<div class="inner">
					<div>
						<div class="box">
							<c:if test="${empty authInfo }">
								<form:form action="login" name="frm" method="post" id="frm" 
									modelAttribute="loginCommand">
								<table border = "1">
									<tr><td>아이디</td>
										<td><form:input path="loginId" id = "loginId"/>
											<form:errors path="loginId"/>
											</td>
										<td rowspan="2">
											<input type="image" src="images/img1.jpg"  id="imgSubmit" 
											width="50px" height="50px"/>
										</td>	
									</tr>
									<tr><td>비밀번호</td>
										<td><input type="password" name="loginPw" id = "loginPw"/>
											<form:errors path="loginPw"/>
										</td>                     
									</tr>
									<tr><td colspan="3	">
										아이디 찾기 / 
										비밀번호 찾기 / 
										<a href="member/agree">회원가입</a></td></tr>
								</table>
								</form:form>
							</c:if>
						</div>
					</div>
				</div>
			</section>

		<!-- Two -->
			<section id="two" class="wrapper style3">
				<div class="inner">
					<div id="flexgrid">
						<div>
							<header>
								<h3>Tempus Feugiat</h3>
							</header>
							<p>Morbi interdum mollis sapien. Sed ac risus. Phasellus lacinia, magna a ullamcorper laoreet, lectus arcu</p>
							<ul class="actions">
								<li><a href="#" class="button alt">Learn More</a></li>
							</ul>
						</div>
						<div>
							<header>
								<h3>Aliquam Nulla</h3>
							</header>
							<p>Ut convallis, sem sit amet interdum consectetuer, odio augue aliquam leo, nec dapibus tortor nibh sed </p>
							<ul class="actions">
								<li><a href="#" class="button alt">Learn More</a></li>
							</ul>
						</div>
						<div>
							<header>
								<h3>Sed Magna</h3>
							</header>
							<p>Suspendisse mauris. Fusce accumsan mollis eros. Pellentesque a diam sit amet mi ullamcorper vehicula.</p>
							<ul class="actions">
								<li><a href="#" class="button alt">Learn More</a></li>
							</ul>
						</div>
					</div>
				</div>
			</section>

		<!-- Three -->
			<section id="three" class="wrapper style2">
				<div class="inner">
					<div class="grid-style">

						<div>
							<div class="box">
								<div class="image fit">
									<img src="images/pic02.jpg" alt="" />
								</div>
								<div class="content">
									<header class="align-center">
										<h2>Lorem ipsum dolor</h2>
										<p>maecenas feugiat ex purus, quis volutpat lacus placerat</p>
									</header>
									<hr />
									<p> Cras aliquet urna ut sapien tincidunt, quis malesuada elit facilisis. Vestibulum sit amet tortor velit. Nam elementum nibh a libero pharetra elementum. Maecenas feugiat ex purus, quis volutpat lacus placerat malesuada. Praesent in sem ex. Morbi mattis sapien pretium tellus venenatis, at egestas urna ornare.</p>
								</div>
							</div>
						</div>

						<div>
							<div class="box">
								<div class="image fit">
									<img src="images/pic03.jpg" alt="" />
								</div>
								<div class="content">
									<header class="align-center">
										<h2>Vestibulum sit amet</h2>
										<p>mattis sapien pretium tellus venenatis</p>
									</header>
									<hr />
									<p> Cras aliquet urna ut sapien tincidunt, quis malesuada elit facilisis. Vestibulum sit amet tortor velit. Nam elementum nibh a libero pharetra elementum. Maecenas feugiat ex purus, quis volutpat lacus placerat malesuada. Praesent in sem ex. Morbi mattis sapien pretium tellus venenatis, at egestas urna ornare.</p>
								</div>
							</div>
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
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/jquery.scrolly.min.js"></script>
			<script src="assets/js/jquery.scrollex.min.js"></script>
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>

	</body>
</html>