package kr.co.wanted.recruit.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RecruitUpdate {
	
	private long recruitId;
	
	private String position;
	
	private int reward;
	
	private String detail;
	
	private String technologies;
	
	@Builder
	public RecruitUpdate(long recruitId, String position, int reward, String detail, String technologies) {
		this.recruitId = recruitId;
		this.position = position;
		this.reward = reward;
		this.detail = detail;
		this.technologies = technologies;
	}
	
}
