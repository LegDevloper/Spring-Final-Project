package site.metacoding.SpringFinalProject.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.SpringFinalProject.service.StadiumService;
import site.metacoding.SpringFinalProject.web.dto.response.CMRespDto;

@RequiredArgsConstructor
@Controller
public class StadiumController {

	private final StadiumService stadiumService;
	
	@GetMapping({"/","stadium"})
	public String getStadium() {
		return "/stadium/stadiumListForm";
	}
	@GetMapping("/stadiumJoin")
	public String stadiumJoin() {
		return "/stadium/stardiumSaveForm";
	}
	
	@PostMapping("/join/stadium")
	public @ResponseBody CMRespDto<?> join(@RequestBody String name) {
		stadiumService.경기장등록(name);
		return new CMRespDto<>(1,"경기장등록 성공",null);
	}
}
