<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="include/include.jsp" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
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
<c:if test="${!empty authInfo }">
	<c:if test="${authInfo.grade == 'mem' }">
		
		<a href="<c:url value='/login/logout'/>">로그 아웃</a>
		<a href="member/memberInfo">내 정보</a>
		<a href="shop/shoppingmall">쇼핑몰</a>
		<a href="rent/rentmall">제품 대여</a>
		<a href="partyRoom/partyInfo">파티룸 예약</a>
		
	</c:if>
	<c:if test="${authInfo.grade == 'emp' }">
		<a href="<c:url value='/login/logout'/>">로그 아웃</a><br />
		<a href="admin/memberList">회원 리스트</a><br/>
		<a href="employees/empRegist">직원 등록</a><br/>
		<a href="employees/empList">직원 리스트 </a><br/>
		<a href="shopgoods/shopgoodsRegist">상품 등록 </a><br/>
		<a href="shopgoods/shopgoodsList">상품 리스트 </a><br/>
		<a href="partyRoom/partyForm">파티룸 등록</a><br/>
		<a href="partyRoom/partyList">파티룸 리스트</a><br/>
		<a href="emp/empInfo">내 정보</a>
	</c:if>
</c:if>
</body>
</html>