package site.metacoding.SpringFinalProject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.SpringFinalProject.domain.player.PlayerDao;
import site.metacoding.SpringFinalProject.web.dto.request.player.PlayerJoinDto;
import site.metacoding.SpringFinalProject.web.dto.request.player.UpdateDto;
import site.metacoding.SpringFinalProject.web.dto.response.player.MainDto;

@RequiredArgsConstructor
@Service
public class PlayerService {
	private final PlayerDao playerDao;
	
	public void 선수등록(PlayerJoinDto playerJoinDto) {
		playerDao.insert(playerJoinDto);
	}
	public List<MainDto> 선수목록보기(){
		List<MainDto> playerList = playerDao.findAll();
		return playerList;
	}
	public Integer 선수번호보기(Integer rowno) {
		return playerDao.findToId(rowno);
	}
	public void 선수정보수정(UpdateDto updateDto) {
		playerDao.update(updateDto);
	}
	public String 선수이름보기(Integer id) {
		return playerDao.findToName(id);
	}
	public void 선수삭제(Integer id) {
		playerDao.deleteById(id);
	}
}
