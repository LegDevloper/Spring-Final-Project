<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<br>

<div class="d-flex justify-content-center">
	<h1>팀 목록 페이지입니다.</h1>
</div>
<br>

<div class="d-flex justify-content-center">
	<div style="width: 1200px">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>번호</th>
					<th>경기장 이름</th>
					<th>팀 이름</th>
					<th>창단일</th>
					<th>수정</th>
					<th>삭제</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="team" items="${teamList}" step="1">
					<tr>
						<td>${team.ROWNO}</td>
						<td>${team.stadiumName}</td>
						<td>${team.teamName}</td>
						<td>${team.createdAT}</td>
						<td><i class="fa-solid fa-pen-clip"></i></td>
						<td><i class="fa-solid fa-eraser"></i></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>




<%@ include file="../layout/footer.jsp"%>