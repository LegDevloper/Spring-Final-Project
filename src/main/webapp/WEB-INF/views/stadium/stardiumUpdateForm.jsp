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
	<button id="btnInsert" class="btn btn-primary" type="button">수정</button>
	<input value="${stadium.ROWNO}" id="rowno" type="hidden">
</div>

<script>

	$("#btnInsert").click(()=>{
		let data = {
				rowno : $("#rowno").val(),
				stadiumName : $("#stadiumName").val()
		};
		$.ajax("/update/stadium",{
			type: "PUT",
			dataType: "json",
			data: JSON.stringify(data),
			headers: {
				"Content-Type": "application/json; charset=utf-8"
			}
		}).done((res)=>{
			if (res.code == 1) {
				alert("경기장정보 수정성공");
				location.href = "/";
			}else{
				alert("수정 실패");
				
			}
		});
	});
</script>


<%@ include file="../layout/footer.jsp"%>