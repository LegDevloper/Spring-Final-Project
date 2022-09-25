package site.metacoding.SpringFinalProject.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.SpringFinalProject.service.StadiumService;
import site.metacoding.SpringFinalProject.web.dto.request.stadium.UpdateDto;
import site.metacoding.SpringFinalProject.web.dto.response.CMRespDto;
import site.metacoding.SpringFinalProject.web.dto.response.stadium.MainDto;

@RequiredArgsConstructor
@Controller
public class StadiumController {

	private final StadiumService stadiumService;

	//==============================Create
	@PostMapping("api/join/stadium")
	public @ResponseBody CMRespDto<?> join(@RequestBody String name) {
		stadiumService.경기장등록(name);
		return new CMRespDto<>(1, "경기장등록 성공", null);
	}

	//==============================Read
	@GetMapping({ "/", "/stadium" })
	public String getStadium(Model model) {
		List<MainDto> stadiumList = stadiumService.경기장목록보기();
		model.addAttribute("stadiumList", stadiumList);

		return "/stadium/stadiumListForm";
	}

	@GetMapping("/stadiumJoin")
	public String stadiumJoin() {
		return "/stadium/stardiumSaveForm";
	}
	
	//==============================Update
	@GetMapping("/stadium/update/{id}")
	public String stadiumUpdate(@PathVariable Integer id,Model model) {
		
		MainDto mainDtoPS = stadiumService.경기장한건보기(id);
		model.addAttribute("stadium",mainDtoPS);
		return "/stadium/stardiumUpdateForm";
	}
	@PutMapping("/update/stadium")
	public @ResponseBody CMRespDto<?> update(@RequestBody UpdateDto updateDto){
		Integer id = stadiumService.경기장번호보기(updateDto.getROWNO());
		updateDto.setROWNO(id);
		stadiumService.경기장수정하기(updateDto);
		
		return new CMRespDto<>(1,"경기장정보 수정", null);
	}
	
	//==============================Delete
	@DeleteMapping("/delete/stadium/{rowno}")
	public @ResponseBody CMRespDto<?> delete(@PathVariable Integer rowno){
		Integer id = stadiumService.경기장번호보기(rowno);
		stadiumService.경기장삭제하기(id);
		return new CMRespDto<>(1, "삭제성공", null);
	}
	
}
