package site.metacoding.SpringFinalProject.domain.player;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Player {
	private Integer id;
	private String teamName;
	private String playerName;
	private String position;
	private Boolean isOut;
	private Timestamp createdAt;
}
