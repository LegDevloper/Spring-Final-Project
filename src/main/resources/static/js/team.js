/**
 * 
 */

$('.btnUpdate').bind('click', function() {
	let id = $(this).closest('tr').index() + 1;
	location.href = ("/team/update/" + id);
});

$(".btnDelete").bind('click', function() {
	let rowno = $(this).closest('tr').index() + 1;

	$.ajax("/delete/team/" + rowno, {
		type: "DELETE",
		dataType: "json"
	}).done((res) => {
		if (res.code == 1) {
			let confirmData = confirm("팀을 삭제할까요?");
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

$("#btnInsert").click(() => {
	insert();
});

$("#btnUpdate").click(() => {
	update();
});
function update() {
	let data = {
		teamName: $("#teamName").val(),
		id: $("#id").val(),
		stadiumName: $("#stadiumName option:selected").val()
	};

	$.ajax("/team/update", {
		type: "PUT",
		dataType: "json",
		data: JSON.stringify(data),
		headers: {
			"Content-Type": "application/json; charset=utf-8"
		}
	}).done((res) => {
		if (res.code == 1) {
			alert("팀정보 수정성공");
			location.href = "/teamList";
		} else {
			alert("수정 실패");
		}
	});
}
function insert() {
	let data = {
		teamName: $("#teamName").val(),
		stadiumName: $("#selectBox option:selected").val()
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
		} else {
			alert("팀 등록 실패");
		}
	});
}