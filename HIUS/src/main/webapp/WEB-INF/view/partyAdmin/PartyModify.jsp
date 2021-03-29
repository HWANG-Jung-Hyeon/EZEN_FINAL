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
				alert('에러입니다');
				return false;
			}
	};
	$.ajax(aaa);	
}
</script>
</head>
<body>
	<form action="partyModifyPro" method="post" enctype="multipart/form-data">
		<table width="600" align="center" border=1>
			<tr>
				<th>파티룸 지점</th>
				<td>${partyCommand.prPl }</td>
			</tr>
			<tr>
			<tr>
				<th>파티룸 이미지</th>
				<td>
				<c:forTokens items="${partyCommand.prImg }" delims="'" var="img">
					<img src="../partyAdmin/upload/${img }" width="20" height="20"/>
					${img }
					<button Type="button" onclick="fileDelete('${img}', this);">삭 제</button>
				</c:forTokens>
				파일 추가 : <input type="file" name="prImg" multiple="multiple">
				</td>
			</tr>
			<tr>
				<th>파티룸 내용</th>
				<td><textarea rows="10" cols="50" name="prContent">
					${partyCommand.prContent}
				</textarea></td>
			</tr>
			<tr>
				<th>파티룸 가격</th>
				<td><input path="text" name="prPrice" value="${partyCommand.prPrice }"></td>
			</tr>
			<tr>
				<th>최대 이용 인원</th>
				<td><input type="text" name="prMax" value="${partyCommand.prMax }"></td>
			</tr>
			<tr>
				<th>최대 이용 시간</th>
				<td><input type="text" name="prMintime" value="${partyCommand.prMintime}"></td>
			</tr>
			<tr>
				<th>옵션</th>
				<td>
				<c:if test="${memberCommand.prOp == '바베큐' }">바베큐</c:if> 
				<c:if test="${memberCommand.prOp == '수영장' }">수영장</c:if>
				<c:if test="${memberCommand.prOp == '자쿠지' }">자쿠지</c:if>
				</td>
			</tr>
			<tr>
				<th>파티룸 전화번호</th>
				<td><input type="text" name="prPh" value="${partyCommand.prPh }"></td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="정보 수정" /> 
				</td>
			</tr>
		</table>
	</form>
</body>
</html>