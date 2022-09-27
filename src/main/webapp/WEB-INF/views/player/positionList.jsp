<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<br />

	<table class="table table-striped">
		<!-- 
		<thead>
			<tr>
				<th>포지션</th>
				<c:forEach var="teamName" items="${teamNameList}" step="1">
					<td>${teamName.teamName}</td>
				</c:forEach>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="position" items="${positionList}" step="1">
				<tr>
					<td>${position}</td>
				</tr>
			</c:forEach>
		</tbody>
	-->

		<c:forEach var="position" items="${positionList}" step="1">
			<c:forEach var="teamName" items="${teamNameList}" step="1">
				<th>${teamName.teamName}</th>
			</c:forEach>
			<tr>
				<td>${position}</td>
			</tr>
		</c:forEach>
	</table>
</div>

<%@ include file="../layout/footer.jsp"%>