package site.metacoding.SpringFinalProject.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.SpringFinalProject.service.PlayerService;
import site.metacoding.SpringFinalProject.service.TeamService;
import site.metacoding.SpringFinalProject.web.dto.request.player.PlayerJoinDto;
import site.metacoding.SpringFinalProject.web.dto.response.CMRespDto;
import site.metacoding.SpringFinalProject.web.dto.response.player.MainDto;
import site.metacoding.SpringFinalProject.web.dto.response.team.TeamListDto;

@RequiredArgsConstructor
@Controller
public class PlayerController {
	
	private final PlayerService playerService;
	private final TeamService teamService;
	
	//=====================Create
	@GetMapping("/playerSave")
	public String playerJoin(Model model) {
		List<TeamListDto> teamNameList = teamService.팀명보기();
		model.addAttribute("teamNameList",teamNameList);
		return "/player/playerSaveForm";
	}
	@PostMapping("/player/join")
	public @ResponseBody CMRespDto<?> join(@RequestBody PlayerJoinDto playerJoinDto) {
		playerService.선수등록(playerJoinDto);
		
		return new CMRespDto<>(1,"선수등록성공",null);
	}
	
	//=====================Read
	@GetMapping("/playerList")
	public String playerList(Model model) {
		List<MainDto> playerList = playerService.선수목록보기();
		model.addAttribute("playerList",playerList);
		return "/player/playerListForm";
	}
	//=====================Update
	//=====================Delete
	
	
}
