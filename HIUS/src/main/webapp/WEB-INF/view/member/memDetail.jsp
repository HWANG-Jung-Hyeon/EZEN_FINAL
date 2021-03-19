<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
회원 상세정보<br/>
<table border="1"></table>
<tr><td>회원 아이디</td><td>${memberCommand.getMEM_ID() }</td></tr>
<tr><td>회원 번호</td><td>${memberCommand.getMEM_NO() }</td></tr>
<tr><td>회원 이름</td><td>${memberCommand.getMEM_NAME() }</td></tr>
<tr><td>회원 생년월일</td><td><fmt:formatDate value="${memberCommand.MEM_BIRTH }" type= date" patter="yyyy-MM-dd"/></td></tr>
<tr><td>회원 이메일</td><td>${memberCommand.MEM_EMAIL }</td></tr>
<tr><td>회원 주소</td><td>${memberCommand.MEM_ADDR }</td></tr>
<tr><td>회원 성별</td>
<td>
<c:choose>
	<c:when test="${memberCommand.GENDER == 'M' }">
		남자
	</c:when>
	<c:when test="${memberCommand.Gender == 'F' }">
		여자
	</c:when>		
</c:choose>
</td></tr>
<tr><td>회원 연락처</td><td>${memberCommand.MEM_PH }</td></tr>
<tr><td>회원 가입일자</td>
<td>
<fmt:formatDate value="${memberCommand.MEM_REG }" type="date" pattern="yyyy-MM-dd"/>
</td>
</tr>
<tr><td colspan="2" align="center">
<a href="memModify">내 정보 수정</a></td></tr>
<a href="memPwForm">비밀번호 변경</a></td></tr>
<a href="memDel">탈퇴</a></td></tr>
<a href='<c:url value="/" />'>홈으로</a>
</td></tr>
</table>
<script>
	function memPwForm(){
		location.href="<c:url value='/member/memPwForm' />"
	}
</script>
</body>
</html>