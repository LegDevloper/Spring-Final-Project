/**
 * 
 */

$("#btnUpdate").click(() => {
	update();

});

$("#btnInsert").click(() => {
	playerJoin();
});

$(".btnUpdate").click(function() {
	let rowno = $(this).closest('tr').index() + 1;
	location.href = ("/player/update/" + rowno);
});
$("#btnDelete").click(() => {
	del();
});
function del(){
	let arr = [];
	$("input:checkbox[name='check']:checked").each(function(k, kVal) {
		let tr = kVal.parentElement.parentElement;
		let td = tr.children[0];

		arr[k] = $(td).text();
	});

	$.ajax("/player/delete", {
		type: "POST",
		dataType: "json",
		data: {
			arr: arr
		},
		traditional: true
	}).done((res) => {
		if (res.code == 1) {
			alert("삭제성공");
			location.href = "/playerList"
		}
	});
}
function update() {
	let data = {
		playerName: $("#playerName").val(),
		teamName: $("#teamName option:selected").text(),
		id: $("#id").val(),
		posi: $("#position option:selected").text()
	};

	$.ajax("/player/update", {
		type: "PUT",
		dataType: "json",
		data: JSON.stringify(data),
		headers: {
			"Content-Type": "application/json; charset=utf-8"
		}
	}).done((res) => {
		if (res.code == 1) {
			alert("선수정보 수정성공");
			location.href = "/playerList";
		} else {
			alert("수정 실패");

		}
	});
}


function playerJoin() {
	let data = {
		teamName: $("#teamName option:selected").val(),
		playerName: $("#playerName").val(),
		posi: $("#position option:selected").text()
	}
	console.log(data);

	$.ajax("/player/join", {
		type: "POST",
		dataType: "json",
		data: JSON.stringify(data),
		headers: {
			"Content-Type": "application/json; charset=UTF-8"
		}
	}).done((res) => {
		if (res.code == 1) {
			alert("선수 등록성공");
			location.href = "/playerList";
		} else {
			alert("선수 등록 실패");

		}
	});

}