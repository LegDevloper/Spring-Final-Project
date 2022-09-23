package site.metacoding.SpringFinalProject.domain.team;

import java.util.List;

import site.metacoding.SpringFinalProject.web.dto.request.team.TeamJoinDto;

public interface TeamDao {
	public void insert(TeamJoinDto teamJoinDto);
	public void findById(Integer id);
	public List<Team> findAll();
	public void update(Team team);
	public void deleteById(Integer id);
}
