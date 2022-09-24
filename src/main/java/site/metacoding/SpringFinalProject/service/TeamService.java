package site.metacoding.SpringFinalProject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.SpringFinalProject.domain.team.TeamDao;
import site.metacoding.SpringFinalProject.web.dto.request.team.TeamJoinDto;
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

}
