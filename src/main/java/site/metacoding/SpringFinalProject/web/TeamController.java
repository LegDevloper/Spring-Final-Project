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
import site.metacoding.SpringFinalProject.service.TeamService;
import site.metacoding.SpringFinalProject.web.dto.request.team.TeamJoinDto;
import site.metacoding.SpringFinalProject.web.dto.request.team.UpdateDto;
import site.metacoding.SpringFinalProject.web.dto.response.CMRespDto;
import site.metacoding.SpringFinalProject.web.dto.response.stadium.StadiumNameDto;
import site.metacoding.SpringFinalProject.web.dto.response.team.MainDto;

@RequiredArgsConstructor
@Controller
public class TeamController {
	private final TeamService teamService;
	private final StadiumService stadiumService;
	
	//============================Create
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

	//============================Read
	@GetMapping("/teamList")
	public String getTeam(Model model) {
		List<MainDto> teamList = teamService.팀목록보기();
		model.addAttribute("teamList",teamList);
		return "/team/teamListForm";
	}
	
	//============================Update
	@GetMapping("/team/update/{rowno}")
	public String teamUpdateForm(@PathVariable Integer rowno, Model model) {
		List<StadiumNameDto> stadiumNameList = stadiumService.경기장이름보기();
		
		Integer id = teamService.팀순번보기(rowno);
		System.out.println("id : "+ id);
		String teamName = teamService.팀명한건보기(id);
		
		model.addAttribute("stadiumNameList",stadiumNameList);
		model.addAttribute("teamName",teamName);
		model.addAttribute("id",id);
		return "/team/teamUpdateForm";
	}
	@PutMapping("/team/update")
	public @ResponseBody CMRespDto<?> update(@RequestBody UpdateDto updateDto){
		System.out.println(updateDto.getId());
		teamService.팀수정하기(updateDto);
		return new CMRespDto<>(1,"수정성공", null);
	}
	
	//============================Delete
	@DeleteMapping("/delete/team/{rowno}")
	public @ResponseBody CMRespDto<?> delete(@PathVariable Integer rowno){
		Integer id = teamService.팀순번보기(rowno);
		teamService.팀삭제하기(id);
		return new CMRespDto<>(1, "삭제성공", null);
	}

}
