package kr.co.wanted.recruit.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.querydsl.core.annotations.QueryProjection;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@JsonInclude(JsonInclude.Include.NON_NULL) // Null 값인 필드 제외
@Getter
@Setter
public class RecruitResponse {
	
	private long recruitId;
	private String companyName;
	private String country;
	private String region;
	private String position;
	private int reward;
	private String detail;
	private String technologies;
	private List<Long> otherRecruitList;
	
	@QueryProjection
	public RecruitResponse(long recruitId, String companyName, String country, String region, String position, int reward, String technologies) {
		this.recruitId = recruitId;
		this.companyName = companyName;
		this.country = country;
		this.region = region;
		this.position = position;
		this.reward = reward;
		this.technologies = technologies;
	}
	
	@QueryProjection
	public RecruitResponse(long recruitId, String companyName, String country, String region, String position, int reward, String technologies, String detail) {
		this.recruitId = recruitId;
		this.companyName = companyName;
		this.country = country;
		this.region = region;
		this.position = position;
		this.reward = reward;
		this.technologies = technologies;
		this.detail = detail;
	}
}
