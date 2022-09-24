<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<br>

<div class="d-flex justify-content-center">
	<h1>팀 등록 페이지입니다</h1>
</div>
<br>
<div class="d-flex justify-content-center">

	경기장을 고르세요 :&nbsp; <select id="selectBox">
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



<script>
	$("#btnInsert").click(()=>{
		insert();

	});
	function insert(){
		let data = {
			teamName : $("#teamName").val(),
			stadiumName : $("#selectBox option:selected"). val()
		};

		$.ajax("/join/team", {
			type: "POST",
			dataType: "json",
			data: JSON.stringify(data),
			headers: {
				"Content-Type": "application/json"
			}
		}).done((res) => {
			if (res.code == 1) {
				alert("팀 등록성공");
				location.href = "/teamList";
			}else{
				alert("팀 등록 실패");
				
			}
		});
	}

</script>


<%@ include file="../layout/footer.jsp"%>