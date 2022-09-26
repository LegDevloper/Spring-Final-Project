package site.metacoding.SpringFinalProject.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.SpringFinalProject.service.PlayerService;
import site.metacoding.SpringFinalProject.web.dto.response.CMRespDto;
import site.metacoding.SpringFinalProject.web.dto.response.player.MainDto;

@RequiredArgsConstructor
@Controller
public class KickoutController {
	private final PlayerService playerService;
	
	
	@GetMapping("/kickoutJoinForm")
	public String kickoutJoin(Model model) {
		List<MainDto> playerList = playerService.선수목록보기();
		model.addAttribute("playerList",playerList);
		return "/kickout/kickoutJoinForm";
	}
	/*
	@PostMapping("/kickout/join")
	public CMRespDto<?> join(@RequestBody KickoutJoinDto kickoutJoinDto){
		//playerService.선수방출하기(kickoutJoinDto);
		//kickoutService.방출선수등록하기();
	}
	*/
}
