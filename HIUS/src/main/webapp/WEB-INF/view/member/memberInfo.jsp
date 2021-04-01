<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</script>
</head>
<body>
이름 : ${memberCommand.getMemName() }<br />
아이디 : ${memberCommand.getMemId() }<br />
연락처 : ${memberCommand.getMemPh() }<br />
성별: <c:if test="${memberCommand.Gender == 'M' }">남자</c:if>
	<c:if test ="${memberCommand.Gender == 'F' }">여자</c:if>
<br />	
주소 : ${memberCommand.getMemAddr() }<br />
연락처: ${memberCommand.getMemPh() }<br />
<input type ="button" id="modify" value="수  정">
<input type="button" value="탈  퇴" id="memDel"/>
</body>
</html>