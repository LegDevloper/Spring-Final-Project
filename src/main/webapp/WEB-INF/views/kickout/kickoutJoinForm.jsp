<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<br>

<div class="d-flex justify-content-center">
	<h1>퇴출선수 등록 페이지입니다</h1>
</div>
<br>
<div class="d-flex justify-content-center">

	방출할 선수를 고르세요 :&nbsp; <select id="selectPlayer">
	<c:forEach var="player" items="${playerList}">
	<option value="${player.playerName}">${player.playerName}</option>    
	</c:forEach>
		
	</select>
</div>
<br>

<div class="d-flex justify-content-center">
	<div style="width: 200px">
		<input id="teamName" class="form-control me-2" type="text" placeholder="방출사유 입력하세요">

	</div>
</div>
<br>
<div class="d-flex justify-content-center">
	<button id="btnInsert" class="btn btn-primary" type="button">등록</button>
</div>



<script>
	
</script>


<%@ include file="../layout/footer.jsp"%>