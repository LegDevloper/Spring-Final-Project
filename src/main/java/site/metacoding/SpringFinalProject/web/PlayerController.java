package site.metacoding.SpringFinalProject.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.SpringFinalProject.service.PlayerService;
import site.metacoding.SpringFinalProject.service.TeamService;
import site.metacoding.SpringFinalProject.web.dto.request.player.PlayerJoinDto;
import site.metacoding.SpringFinalProject.web.dto.request.player.UpdateDto;
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
		List<site.metacoding.SpringFinalProject.web.dto.response.team.MainDto> teamList = teamService.팀목록보기();
		model.addAttribute("teamList",teamList);
		return "/player/playerListForm";
	}
	
	//=====================Update
	@GetMapping("/player/update/{rowno}")
	public String teamUpdateForm(@PathVariable Integer rowno, Model model) {
		List<TeamListDto> teamNameList = teamService.팀명보기();
		Integer id = playerService.선수번호보기(rowno);
		String playerName = playerService.선수이름보기(id);
		model.addAttribute("id",id);
		model.addAttribute("teamNameList",teamNameList);
		model.addAttribute("playerName",playerName);
		return "/player/playerUpdateForm";
	}
	@PutMapping("/player/update")
	public @ResponseBody CMRespDto<?> update(@RequestBody UpdateDto updateDto){
		playerService.선수정보수정(updateDto);
		
		return new CMRespDto<>(1, "선수정보수정 성공", null);
	}
	
	//=====================Delete
	@PostMapping("/player/delete")
	public @ResponseBody CMRespDto<?> delete(@RequestParam(value="arr", required=false) String[] arr){
		for(int i=0;i<arr.length;i++) {
			Integer rowno = Integer.parseInt(arr[i]);
			Integer id = playerService.선수번호보기(rowno);
			playerService.선수삭제(id);
		}
		return new CMRespDto<>(1,"통신성공",null);
	}
	
	
}
