package site.metacoding.SpringFinalProject.domain.stadium;

import java.util.List;

import site.metacoding.SpringFinalProject.web.dto.request.stadium.UpdateDto;
import site.metacoding.SpringFinalProject.web.dto.response.stadium.MainDto;
import site.metacoding.SpringFinalProject.web.dto.response.stadium.StadiumNameDto;


public interface StadiumDao {
	public void insert(String name);
	public MainDto findById(Integer ROWNO);
	public List<MainDto> findAll();
	public void update(UpdateDto updateDto);
	public void deleteById(Integer id);
	public List<StadiumNameDto> findToStadiumName();
	public Integer findToId(Integer ROWNO);
}
