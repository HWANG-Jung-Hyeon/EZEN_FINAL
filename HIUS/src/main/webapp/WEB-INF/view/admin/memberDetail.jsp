<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ include file="../include/include.jsp" %>	    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" 
		src="https://code.jquery.com/jquery-1.8.1.min.js"></script>
<script type="text/javascript">
$(function(){
	});
	$("#memDel").click(function(){
		if(confirm("탈퇴하시겠습니까??")){
			location.href=
				'<c:url value="/admin/memberDelete/${memberCommand.memId }"/>';
		}
	});
});	
</script>
</head>
<body>
<table width="600" align ="center" border="1">
	<caption>회원 상세정보</caption>
	<tr><th>회원 아이디</th><td>${memberCommand.memId }</td></tr>
	<tr><th>회원 이름</th><td>${memberCommand.memName }</td></tr>
	<tr><th>회원 생년월일</th><td><fmt:formatDate value="${memberCommand.memBirth }" type= "date" pattern="yyyy-MM-dd"/></td></tr>
	<tr><th>회원 이메일</th><td>${memberCommand.memEmail }</td></tr>
	<tr><th>회원 주소</th><td>${memberCommand.memAddr }</td></tr>
	<tr><th>회원 성별</th><td>${memberCommand.gender }</td></tr>
	<tr><th>회원 연락처</th><td>${memberCommand.memPh }</td></tr>
	<tr><th>회원 가입일자</th>
<td>
<fmt:formatDate value="${memberCommand.memReg }" type="date" pattern="yyyy-MM-dd"/>
</td>
</tr>
<tr><td colspan="2" align="center">
<input type="button" id="modify" value= "수   정">
<input type="button" id="memDel" value="탈   퇴" >
<input type="button" value="회원리스트" onclick ="javascript:location.href='<c:url value="/admin/memberList"/>';"/>
</td></tr>	
</table>
</body>
</html>