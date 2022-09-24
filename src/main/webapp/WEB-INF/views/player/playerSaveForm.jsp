<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<br>
<div class="d-flex justify-content-center">
	<h1>선수 등록 페이지입니다</h1>
</div>

<br>

<form>
	<div class="d-flex justify-content-center">
		소속팀을 고르세요 :&nbsp; <select id="teamName">
			<c:forEach var="teamName" items="${teamNameList}"> 
				<option value="${teamName.teamName}">${teamName.teamName}</option>    
		</c:forEach>
		</select>
	</div>
	
	<div class="d-flex justify-content-center">
		포지션을 고르세요 :&nbsp; 
		<select id="position">
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
	<br>
	<div class="d-flex justify-content-center">
		<div style="width: 200px; margin-right: 20px">
			<input id="playerName" class="form-control me-2" type="text"
				placeholder="선수명을 입력하세요">
		</div>
		<button id="btnInsert" class="btn btn-primary" type="button">등록</button>
	</div>
</form>




<script>
	$("#btnInsert").click(()=>{
		playerJoin();
	});
	function playerJoin(){
		let data = {
				teamName : $("#teamName").val(),
				playerName : $("#playerName").val(),
				position : $("#position option:selected").val()
		}
		
		$.ajax("/player/join",{
			type: "POST",
			dataType: "json",
			data: JSON.stringify(data),
			headers: {
				"Content-Type": "application/json"
			}
		}).done((res)=>{
			if (res.code == 1) {
				alert("선수 등록성공");
				location.href = "/playerList";
			}else{
				alert("선수 등록 실패");
				
			}
		});
	}
</script>

<%@ include file="../layout/footer.jsp"%>