<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<br>

<div class="d-flex justify-content-center">
	<h1>경기장 목록 페이지입니다.</h1>
</div>
<br>
<div class="d-flex justify-content-center">

	<div style="width: 1200px">
		<table id="myTable" class="table table-striped">
			<thead>
				<tr>
					<th>번호</th>
					<th>경기장 이름</th>
					<th>창단일</th>
					<th>수정</th>
					<th>삭제</th>
				</tr>
			</thead>
			<tbody class="id">

				<c:forEach var="stadium" items="${stadiumList}">
					<tr>
						<td class="num">${stadium.ROWNO}</td>
						<td>${stadium.stadiumName}</td>
						<td>${stadium.createdAT}</td>
						<td><button class="btnUpdate" type="button"><i class="fa-solid fa-pen-clip"></i></button></td>
						
						<td><button class="btnDelete" type="button"><i class="fa-solid fa-eraser"></i></button></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>

<script>
	  $('.btnUpdate').bind('click', function() { 
	      let id = $(this).closest('tr').index()+1;
	      location.href=("/stadium/update/"+id);
	  });
	  
	  $(".btnDelete").bind('click',function(){
		  let id = $(this).closest('tr').index()+1;
		  
		 
		  $.ajax("/delete/stadium/"+id,{
			  type: "DELETE",
			  dataType:"json",
		  }).done((res)=>{
			  if(res.code==1){
				  let confirmData = confirm("경기장 정보를 삭제할까요?");
				  if(confirmData){
					  location.reload();
				  }
				  else{
					 // alert("취소하겠습니다"); 취소할때 기능넣어야함
				  }
			  }
			  else{
				  alert("삭제실패!");
			  }
		  });
	  })
	  

	
</script>

<%@ include file="../layout/footer.jsp"%>