/**
 * 
 */
$("#btnUpdate").click(() => {
	update();

});
$("#btnInsert").click(() => {
	insert();
});
$('.btnUpdate').bind('click', function() {
	let id = $(this).closest('tr').index() + 1;
	location.href = ("/stadium/update/" + id);
});

$(".btnDelete").bind('click', function() {
	let id = $(this).closest('tr').index() + 1;


	$.ajax("/delete/stadium/" + id, {
		type: "DELETE",
		dataType: "json"
	}).done((res) => {
		if (res.code == 1) {
			let confirmData = confirm("경기장 정보를 삭제할까요?");
			if (confirmData) {
				location.reload();
			}
			else {
				// alert("취소하겠습니다"); 취소할때 기능넣어야함
			}
		}
		else {
			alert("삭제실패!");
		}
	});

});


function insert() {
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
function update() {
	let data = {
		rowno: $("#rowno").val(),
		stadiumName: $("#stadiumName").val()
	};
	$.ajax("/update/stadium", {
		type: "PUT",
		dataType: "json",
		data: JSON.stringify(data),
		headers: {
			"Content-Type": "application/json; charset=utf-8"
		}
	}).done((res) => {
		if (res.code == 1) {
			alert("경기장정보 수정성공");
			location.href = "/";
		} else {
			alert("수정 실패");

		}
	});
}