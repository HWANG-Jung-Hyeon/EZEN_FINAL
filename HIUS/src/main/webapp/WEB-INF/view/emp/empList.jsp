<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
직원리스트<br />
<table border="1">
<tr><td>번호</td><td>직원번호</td><td>직원 ID</td><td>직원 이름</td></tr>
<c:forEach items="${empList}" var="dto" varStatus="empNum">
<tr>
<td>${empNum.count }</td>
<td><a href="empDetail?emp_id=${dto.empId }" >${dto.empNo }</a></td>
<td>${dto.empId }</td>
<td>${dto.empName }</td>
</tr>
</c:forEach>
</table>
</body>
</html>