<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" 
		src="https://code.jquery.com/jquery-1.8.1.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#modify").click(function(){
		location.href=
			'<c:url value="/member/memberModify/${memberCommand.memId }"/>';
	});
	$("#memDel").click(function(){
		if(confirm("탈퇴하시겠습니까??")){
			location.href=
				'<c:url value="/member/memberDelete/${memberCommand.memId }"/>';
		}
	});
});	
</script>
</head>
<body>

이름 : ${memberCommand.memName }<br />
아이디 : ${memberCommand.memId }<br />
연락처 : ${memberCommand.memPh }<br />
성별: <c:if test="${memberCommand.gender == 'M' }">남자</c:if>
	<c:if test ="${memberCommand.gender == 'F' }">여자</c:if>< br/>
주소 : ${memberCommand.memAddr }<br />
연락처: #{memberCommand.memPh }<br />
<input type ="button" id="modify" value="수  정">
<input type="button" value="탈  퇴" id="memDel"/>
<input type="button" value="회원리스트" onclick ="javascript:history.back();"/>
</body>
</html>