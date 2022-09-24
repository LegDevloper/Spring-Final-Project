package site.metacoding.SpringFinalProject.web.dto.response.player;


import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class MainDto {
	private Integer ROWNO;
	private String teamName;
	private String playerName;
	private String POSITION;
	private String createdAT;
}
