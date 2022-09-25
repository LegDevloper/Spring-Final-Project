package site.metacoding.SpringFinalProject.web.dto.request.team;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class UpdateDto {
	private Integer id;
	private String teamName;
	private String stadiumName;
}
