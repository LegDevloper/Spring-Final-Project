package site.metacoding.SpringFinalProject.domain.team;

import java.util.List;

import site.metacoding.SpringFinalProject.web.dto.request.team.TeamJoinDto;
import site.metacoding.SpringFinalProject.web.dto.response.team.MainDto;
import site.metacoding.SpringFinalProject.web.dto.response.team.TeamListDto;

public interface TeamDao {
	public void insert(TeamJoinDto teamJoinDto);
	public void findById(Integer id);
	public List<MainDto> findAll();
	public void update(Team team);
	public void deleteById(Integer id);
	public List<TeamListDto> findToTeamName();
}
