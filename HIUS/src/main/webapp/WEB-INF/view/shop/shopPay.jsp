<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="shopPayment" name = "frm" id="frm" method = "post">
 <input type="hidden" name="orderNo" value="${lists[0].orderNo}" />
 <input type="hidden" name="shopPaysum" value="${lists[0].orderPay }" />
 <table border="1">
 <tr><td>�̹���</td><td>��ǰ��</td><td>����</td><td>��ǰ ����</td></tr>
 <c:forEach items="${lists}" var="dto" >
 <tr><td><img src="../shopgoods/image/${dto.shopgoodsImage }" width="50"/></td><td>${dto.shopgoodName }</td><td>${dto.shopgoodsQty }</td><td>${dto.shopgoodsPrice }</td></tr>
 </c:forEach>
 <tr><td>�޴� ���</td><td colspan="3"><input type="text" name="rcvName"></td></tr>
 <tr><td>�޴� ��� �ּ�</td><td colspan="3"><input type="text" name="rcvAddr"></td></tr>
 <tr><td>������ ī���ȣ</td><td colspan="3"><input type="text"name="shopPaymet"></td></tr>
 <tr><td>������ �ݾ�</td><td colspan="3">${lists[0].orderPay }</td></tr>
 <tr><td colspan="2" align="center"><input type="submit" value="����"></td></tr>
 </table>
</form>
</body>
</html>