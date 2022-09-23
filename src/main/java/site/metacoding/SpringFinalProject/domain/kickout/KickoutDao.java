package site.metacoding.SpringFinalProject.domain.kickout;

import java.util.List;


public interface KickoutDao {
	public void insert(Kickout kickout);
	public void findById(Integer id);
	public List<Kickout> findAll();
	public void update(Kickout kickout);
	public void deleteById(Integer id);
}
