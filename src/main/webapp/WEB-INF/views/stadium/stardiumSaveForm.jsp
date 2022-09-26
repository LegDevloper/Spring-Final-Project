<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<br>

<div class="d-flex justify-content-center">
	<h1>경기장 등록 페이지입니다</h1>
</div>
<br>
<div class="d-flex justify-content-center">
	<div style="width: 400px">
		<input id="stadiumName" class="form-control me-2" type="text"
			placeholder="경기장 명을 입력하세요">

	</div>
	<button id="btnInsert" class="btn btn-primary" type="button">등록</button>
</div>

<script src="/js/stadium.js">
</script>


<%@ include file="../layout/footer.jsp"%>