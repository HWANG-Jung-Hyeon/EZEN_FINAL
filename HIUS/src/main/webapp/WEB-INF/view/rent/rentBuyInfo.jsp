<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
					<li><a href="index.html">Home</a></li>
					<li><a href="generic.html">Generic</a></li>
					<li><a href="elements.html">Elements</a></li>
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
							<header class="align-center">
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

		<!-- Footer -->
			<footer id="footer" class="wrapper">
				<div class="inner">
					<section>
						<div class="box">
							<div class="content">
								<h2 class="align-center">Get in Touch</h2>
								<hr />
								<form action="#" method="post">
									<div class="field half first">
										<label for="name">Name</label>
										<input name="name" id="name" type="text" placeholder="Name">
									</div>
									<div class="field half">
										<label for="email">Email</label>
										<input name="email" id="email" type="email" placeholder="Email">
									</div>
									<div class="field">
										<label for="dept">Department</label>
										<div class="select-wrapper">
											<select name="dept" id="dept">
												<option value="">- Category -</option>
												<option value="1">Manufacturing</option>
												<option value="1">Shipping</option>
												<option value="1">Administration</option>
												<option value="1">Human Resources</option>
											</select>
										</div>
									</div>
									<div class="field">
										<label for="message">Message</label>
										<textarea name="message" id="message" rows="6" placeholder="Message"></textarea>
									</div>
									<ul class="actions align-center">
										<li><input value="Send Message" class="button special" type="submit"></li>
									</ul>
								</form>
							</div>
						</div>
					</section>
					<div class="copyright">
						&copy; Untitled Design: <a href="https://templated.co/">TEMPLATED</a>. Images <a href="https://unsplash.com/">Unsplash</a> Video <a href="http://coverr.co/">Coverr</a>.
					</div>
				</div>
			</footer>

		<!-- Scripts -->
			<script src="../assets/js/jquery.min.js"></script>
			<script src="../assets/js/jquery.scrolly.min.js"></script>
			<script src="../assets/js/jquery.scrollex.min.js"></script>
			<script src="../assets/js/skel.min.js"></script>
			<script src="../assets/js/util.js"></script>
			<script src="../assets/js/main.js"></script>

	</body>
</html>