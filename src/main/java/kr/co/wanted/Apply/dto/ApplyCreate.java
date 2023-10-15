package kr.co.wanted.Apply.dto;

import jakarta.validation.constraints.NotNull;
import kr.co.wanted.Apply.entity.Apply;
import kr.co.wanted.user.entity.Member;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ApplyCreate {
	
	@NotNull(message = "사용자 id를 입력해주세요.")
	private long memberId;
	
	@NotNull(message = "채용공고 id를 입력해주세요.")
	private long recruitId;
	
	// resquest dto 로 받은 객체를 entity 화하여 저장하는 용도
	public Apply toEntity() {
		return Apply.builder().member(new Member(memberId))
				.recruitId(recruitId)
				.build();
	}
	
}
