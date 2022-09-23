package site.metacoding.SpringFinalProject.domain.kickout;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Kickout {
	private Integer id;
	private String teamName;
	private String playerName;
	private String reason;
	private Timestamp createdAt;
}
