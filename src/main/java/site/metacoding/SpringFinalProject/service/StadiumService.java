package site.metacoding.SpringFinalProject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.SpringFinalProject.domain.stadium.StadiumDao;
import site.metacoding.SpringFinalProject.web.dto.request.stadium.UpdateDto;
import site.metacoding.SpringFinalProject.web.dto.response.stadium.MainDto;
import site.metacoding.SpringFinalProject.web.dto.response.stadium.StadiumNameDto;

@RequiredArgsConstructor
@Service
public class StadiumService {
	private final StadiumDao stadiumDao;
	
	public void 경기장등록(String name) {
		stadiumDao.insert(name);
	}
	public List<MainDto> 경기장목록보기() {
		List<MainDto> stadiumList = stadiumDao.findAll();
		
		return stadiumList;
	}
	public MainDto 경기장한건보기(Integer rowno) {
		return stadiumDao.findById(rowno);
	}
	public List<StadiumNameDto> 경기장이름보기(){
		List<StadiumNameDto> stadiumNameList = stadiumDao.findToStadiumName();
		return stadiumNameList;
	}
	public void 경기장수정하기(UpdateDto updateDto) {
		stadiumDao.update(updateDto);
	}
	
	public Integer 경기장번호보기(Integer ROWNO) {
		Integer id = stadiumDao.findToId(ROWNO);
		return id;
	}
	public void 경기장삭제하기(Integer id) {
		stadiumDao.deleteById(id);
	}

}
