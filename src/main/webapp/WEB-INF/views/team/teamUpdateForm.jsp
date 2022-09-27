<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<br>

<div class="d-flex justify-content-center">
	<h1>팀 수정 페이지입니다</h1>
</div>
<input id="id" value="${id}" type="hidden">
<br>
<div class="d-flex justify-content-center">

	경기장을 고르세요 :&nbsp; <select id="stadiumName">
		<c:forEach var="stadiumName" items="${stadiumNameList}"> 
				<option value="${stadiumName.name}">${stadiumName.name}</option>    
		</c:forEach>
	</select>
</div>
<br>

<div class="d-flex justify-content-center">
	<div style="width: 200px">
		<input id="teamName" class="form-control me-2" type="text"
			placeholder="수정할 구단명을 입력하세요" value="${teamName}">

	</div>
</div>
<br>
<div class="d-flex justify-content-center">
	<button id="btnUpdate" class="btn btn-primary" type="button">수정</button>
</div>



<script src="/js/team.js">
</script>


<%@ include file="../layout/footer.jsp"%>