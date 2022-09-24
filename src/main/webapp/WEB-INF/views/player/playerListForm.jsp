<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<br>

<div class="d-flex justify-content-center">
	<h1>선수 목록 페이지입니다.</h1>
</div>
<br>
<div class="d-flex justify-content-center">
	<div style="width: 1200px">
		<table class="table table-striped">

			<thead>
				<tr>
					<th>번호</th>
					<th>팀 이름</th>
					<th>포지션</th>
					<th>선수 이름</th>
					<th>등록일</th>
					<th>수정</th>
					<th>삭제</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="player" items="${playerList}" step="1">
					<tr>
						<td>${player.ROWNO}</td>
						<td>${player.teamName}</td>
						<td>${player.playerName}</td>
						<td>${player.POSITION}</td>
						<td>${player.createdAT}</td>
						<td><i class="fa-solid fa-pen-clip"></i></td>
						<td><i class="fa-solid fa-eraser"></i></td>
					</tr>
				</c:forEach>



			</tbody>
		</table>
	</div>
</div>



<%@ include file="../layout/footer.jsp"%>