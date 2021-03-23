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
			<input type="button" id="submit" value="로그인"/>
		</td>		
	</tr>
	<tr><td>비밀번호</td>
		<td><input type="password" name="loginPw" id = "loginPw"/>
			<form:errors path="loginPw"/>
		</td>                     
	</tr>
	<tr><td colspan="3">
		아이디 찾기 / 
		비밀번호 찾기 / 
		<a href="member/memberRegist">회원가입</a></td></tr>
</table>
</form:form>
</c:if>
<c:if test="${!empty authInfo }">
<a href="<c:url value='/login/logout'/>">로그 아웃</a>
<a href="member/memberDetail">내 정보</a>
<a href="member/memberList">회원 리스트</a><br/>
<a href="employees/empRegist">직원 등록</a><br/>
<a href="employees/empList">직원 리스트 </a><br/>
</c:if>
</body>
</html>