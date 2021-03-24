<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/include.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" 
	src="<c:url value='/js/jquery.form.js' />"></script>
<script type="text/javascript">
function fileDelete(imgFile,btn){
	aaa = {
			type:"post",
			url:"imgDel",
			dataType:"text",
			data:{"imgfile":imgFile},
			success: function(result){
				if(result.trim() == "1"){
					$(btn).text("삭제 취소");
				}else{
					$(btn).text("삭제");
				}
			},
			error : function(){
				alert('에러 발생');
				return false;
			}
	};
	$.ajax(aaa);	
}
</script>
</head>
<body>
<form action="goodsModifyPro" method="post" enctype="multiparty/form-data">
<input type="hidden" name="prNo" value="${party.prNo }"/>
파티룸 번호 : ${party.prNo }<br />
파티룸 가격 : <input type="text" name="prPrice" value=${party.prPrice } /><br/>
파티룸 설명 : <textarea rows="10" cols="50" name="prContent">${party.prContent }</textarea><br />
<c:forTokens items="${party.prImg }" delims="'" var="img">
	<img src="../partyRoom/upload/${img }" width="20" height="20"/>
	${img }
	<button type="button" onclick="fileDelete( '${img}', this);">삭제</button>
	<br />
</c:forTokens>
파일 추가 : <input type="file" name="prImg" multiple="multiple"><br />	 
최소 이용 시간 : ${party.prMintime }<br/> 
최대 인원 : ${party.prMax }<br/>
옵션 : ${party.prOp }<br/>
파티룸 연락처 : ${party.prPh }<br/>
<input type="submit" value="수정">
</form>
</body>
</html>