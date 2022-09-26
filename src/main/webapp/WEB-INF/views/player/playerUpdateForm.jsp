<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<br>

<div class="d-flex justify-content-center">
	<h1>선수정보 수정 페이지입니다</h1>
</div>
<input id="id" value="${id}" type="hidden">
<br>
<div class="d-flex justify-content-center">
	소속팀을 고르세요 :&nbsp; <select id="teamName">
		<c:forEach var="teamName" items="${teamNameList}"> 
				<option value="${teamName.teamName}">${teamName.teamName}</option>    
		</c:forEach>
	</select>
</div>
<br>
<div class="d-flex justify-content-center">
	포지션을 고르세요 :&nbsp; <select id="position">
		<option value="position">투수</option>
		<option value="position">포수</option>
		<option value="position">1루수</option>
		<option value="position">2루수</option>
		<option value="position">3루수</option>
		<option value="position">유격수</option>
		<option value="position">중견수</option>
		<option value="position">우익수</option>
		<option value="position">좌익수</option>
	</select>
</div>
<div class="d-flex justify-content-center">
	<div style="width: 200px">
		<input id="playerName" class="form-control me-2" type="text" placeholder="선수명을 입력하세요"
			value="${playerName}">

	</div>
</div>
<br>
<div class="d-flex justify-content-center">
	<button id="btnUpdate" class="btn btn-primary" type="button">수정</button>
</div>



<script src="/js/player.js">
</script>


<%@ include file="../layout/footer.jsp"%>