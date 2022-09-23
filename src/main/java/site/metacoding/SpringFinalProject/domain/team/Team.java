package site.metacoding.SpringFinalProject.domain.team;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Team {
	private Integer id;
	private String teamName;
	private String stadiumName;
	private Timestamp createdAt;
}
