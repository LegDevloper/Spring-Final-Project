package site.metacoding.SpringFinalProject.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.SpringFinalProject.domain.stadium.StadiumDao;

@RequiredArgsConstructor
@Service
public class StadiumService {
	private final StadiumDao stadiumDao;
	
	public void 경기장등록(String name) {
		stadiumDao.insert(name);
	}

}
