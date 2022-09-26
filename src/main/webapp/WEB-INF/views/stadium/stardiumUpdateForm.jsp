<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<br>

<div class="d-flex justify-content-center">
	<h1>경기장정보 수정 페이지입니다</h1>
</div>

<br>
<div class="d-flex justify-content-center">
	<div style="width: 400px">
		<input id="stadiumName" class="form-control me-2" type="text" value="${stadium.stadiumName}"
			placeholder="수정할 경기장 명을 입력하세요">

	</div>
	<button id="btnUpdate" class="btn btn-primary" type="button">수정</button>
	<input value="${stadium.ROWNO}" id="rowno" type="hidden">
</div>

<script src="/js/stadium.js">

	
</script>


<%@ include file="../layout/footer.jsp"%>