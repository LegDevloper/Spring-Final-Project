package site.metacoding.SpringFinalProject.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.SpringFinalProject.service.StadiumService;
import site.metacoding.SpringFinalProject.service.TeamService;
import site.metacoding.SpringFinalProject.web.dto.request.team.TeamJoinDto;
import site.metacoding.SpringFinalProject.web.dto.response.CMRespDto;
import site.metacoding.SpringFinalProject.web.dto.response.stadium.StadiumNameDto;
import site.metacoding.SpringFinalProject.web.dto.response.team.MainDto;

@RequiredArgsConstructor
@Controller
public class TeamController {
	private final TeamService teamService;
	private final StadiumService stadiumService;
	// ===========Create
	@GetMapping("/teamJoin")
	public String teamJoin(Model model) {
		
		List<StadiumNameDto> stadiumNameList = stadiumService.경기장이름보기();
		model.addAttribute("stadiumNameList",stadiumNameList);
		return "/team/teamSaveForm";
	}
	@PostMapping("/join/team")
	public @ResponseBody CMRespDto<?> join(@RequestBody TeamJoinDto teamJoinDto) {
		teamService.팀등록(teamJoinDto);
		
		return new CMRespDto<>(1,"팀등록 성공", null);
	}

	// ===========Read
	@GetMapping("/teamList")
	public String getTeam(Model model) {
		List<MainDto> teamList = teamService.팀목록보기();
		model.addAttribute("teamList",teamList);
		return "/team/teamListForm";
	}

}
