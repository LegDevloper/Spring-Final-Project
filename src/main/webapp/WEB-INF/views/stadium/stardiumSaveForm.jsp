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

<script>
	$("#btnInsert").click(()=>{
		insert();
	});
	
	function insert(){
		let data = $("#stadiumName").val();
	

		$.ajax("api/join/stadium", {
			type: "POST",
			data: data,
			headers: {
				"Content-Type": "text/html; charset=UTF-8"
			}
		}).done((res) => {
			if (res.code == 1) {
				alert("경기장 등록성공");
				location.href = "/";
			}
		});
	}

</script>


<%@ include file="../layout/footer.jsp"%>