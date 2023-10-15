package kr.co.wanted.Apply.dto;

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
public class ApplyResponse {
	
	private long applyId;
	private long memberId;
	private long recruitId;
	
	@QueryProjection
	public ApplyResponse(long applyId, long memberId, long recruitId) {
		this.applyId = applyId;
		this.memberId = memberId;
		this.recruitId = recruitId;
	}
	
}