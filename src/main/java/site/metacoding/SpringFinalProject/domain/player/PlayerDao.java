package site.metacoding.SpringFinalProject.domain.player;

import java.util.List;

import site.metacoding.SpringFinalProject.web.dto.request.player.PlayerJoinDto;
import site.metacoding.SpringFinalProject.web.dto.request.player.UpdateDto;
import site.metacoding.SpringFinalProject.web.dto.response.player.MainDto;


public interface PlayerDao {
	public void insert(PlayerJoinDto playerJoinDto);
	public void findById(Integer id);
	public List<MainDto> findAll();
	public void update(UpdateDto updateDto);
	public void deleteById(Integer id);
	public Integer findToId(Integer rowno);
	public String findToName(Integer id);
}
