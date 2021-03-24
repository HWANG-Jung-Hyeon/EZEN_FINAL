<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="../js/jquery.form.js"></script>
<script type="text/javascript">
function partyCartAdd(prNo){
	$.ajax({
		type : "post",	
		url : "<c:url value='/party/partyCartAdd'/>",
		dataType : "text",
		data : {"prNo":prNo},
		success : function(result){
			if(result.trim()=="1"){
				if(confirm("예약리스트로 가시겠습니까?")){
					location.href="<c:url value='/party/partyCartList'/>";
				}
			}else{
				alert("장바구니에 담기지 않았습니다.\다시 시도 해주세요.");
			}
		},
		error : function(){
			alert('에러 입니다.');
			return;
		}
	});
}
</script>
<a href="<c:url value='/' />" >메인으로</a>
</head>
<body>
관심 파티룸
<a href="javscript:partyCartAdd('${party.prNo }');">wish list</a>
파티룸 위치 : ${party.prNo }<br />
파티룸 가격: <fmt:formatNumber value="${party.prPrice }" type="currency"/>
파티룸 설명: ${fn.replace(pr.prContent,cn,br)} <br/>
<c:forTokens items=${party.prImg }" delims="'" var="img">
	<img src="../partyRoom/upload"/${img }" width="100" height="100"/><br />
</c:forTokens>	
</body>
</html>