package site.metacoding.SpringFinalProject.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.SpringFinalProject.service.TeamServie;
import site.metacoding.SpringFinalProject.web.dto.request.team.TeamJoinDto;
import site.metacoding.SpringFinalProject.web.dto.response.CMRespDto;

@RequiredArgsConstructor
@Controller
public class TeamController {
	private final TeamServie teamService;

	// ===========Create
	@GetMapping("/teamJoin")
	public String teamJoin() {
		return "/team/teamSaveForm";
	}
	@PostMapping("/join/team")
	public @ResponseBody CMRespDto<?> join(@RequestBody TeamJoinDto teamJoinDto) {
		teamService.팀등록(teamJoinDto);
		
		return new CMRespDto<>(1,"팀등록 성공", null);
	}

	// ===========Read
	@GetMapping("/teamList")
	public String getTeam() {
		return "/team/teamListForm";
	}

}
