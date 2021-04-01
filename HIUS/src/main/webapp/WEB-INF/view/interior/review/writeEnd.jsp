<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../../include/include.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HIUS :: 후기 작성 완료</title>
</head>
<body>
후기가 성공적으로 등록되었습니다. <br />
<button value="메인으로 이동" onclick="<c:url value='/'/>"></button>&nbsp;
<button value="입력한 후기 보기" onclick="<c:url value='/interior/reviewDetail?reviewNo=${reviewNo}'/>"></button>

</body>
</html>