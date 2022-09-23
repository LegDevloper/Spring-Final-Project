package site.metacoding.SpringFinalProject.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.SpringFinalProject.domain.team.TeamDao;
import site.metacoding.SpringFinalProject.web.dto.request.team.TeamJoinDto;

@RequiredArgsConstructor
@Service
public class TeamServie {
	private final TeamDao teamDao;
	
	public void 팀등록(TeamJoinDto teamJoinDto) {
		teamDao.insert(teamJoinDto);
	}

}
