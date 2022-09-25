package site.metacoding.SpringFinalProject.web.dto.request.player;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class UpdateDto {
	private String teamName;
	private String posi;
	private String playerName;
	private Integer id;
}
