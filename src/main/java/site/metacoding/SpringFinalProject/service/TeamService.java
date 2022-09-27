package site.metacoding.SpringFinalProject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.SpringFinalProject.domain.team.TeamDao;
import site.metacoding.SpringFinalProject.web.dto.request.team.TeamJoinDto;
import site.metacoding.SpringFinalProject.web.dto.request.team.UpdateDto;
import site.metacoding.SpringFinalProject.web.dto.response.team.MainDto;
import site.metacoding.SpringFinalProject.web.dto.response.team.TeamListDto;

@RequiredArgsConstructor
@Service
public class TeamService {
	private final TeamDao teamDao;
	
	public void 팀등록(TeamJoinDto teamJoinDto) {
		teamDao.insert(teamJoinDto);
	}
	
	public List<MainDto> 팀목록보기(){
		List<MainDto> teamList = teamDao.findAll();
		
		return teamList;
	}
	public List<TeamListDto> 팀명보기(){
		List<TeamListDto> teamNameList = teamDao.findToTeamName();
		
		return teamNameList;
	}
	public Integer 팀순번보기(Integer rowno) {
		return teamDao.findToId(rowno);
	}
	public String 팀명한건보기(Integer id) {
		return teamDao.findById(id);
	}
	public void 팀수정하기(UpdateDto updateDto) {
		teamDao.update(updateDto);
	}
	public void 팀삭제하기(Integer id) {
		teamDao.deleteById(id);
	}

}
