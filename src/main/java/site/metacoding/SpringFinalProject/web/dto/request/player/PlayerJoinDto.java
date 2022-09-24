package site.metacoding.SpringFinalProject.web.dto.request.player;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class PlayerJoinDto {
	private String teamName;
	private String playerName;
	private String position;
}
