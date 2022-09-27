<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<br>

<div class="d-flex justify-content-center">
	<h1>팀 등록 페이지입니다</h1>
</div>
<br>
<div class="d-flex justify-content-center">

	<div style="margin-top:5px">경기장을 고르세요 :&nbsp;&nbsp;</div> <select id="selectBox" class="form-control"  style="width: 200px">
		<c:forEach var="stadiumName" items="${stadiumNameList}"> 
				<option value="${stadiumName.name}">${stadiumName.name}</option>    
		</c:forEach>
	</select>
</div>
<br>

<div class="d-flex justify-content-center">
	<div style="width: 200px">
		<input id="teamName" class="form-control me-2" type="text"
			placeholder="구단명을 입력하세요">

	</div>
</div>
<br>
<div class="d-flex justify-content-center">
	<button id="btnInsert" class="btn btn-primary" type="button">등록</button>
</div>

<script src="/js/team.js">
</script>

<%@ include file="../layout/footer.jsp"%>