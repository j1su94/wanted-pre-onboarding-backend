package kr.co.wanted.recruit.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import kr.co.wanted.company.entity.Company;
import kr.co.wanted.recruit.entity.Recruit;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RecruitCreate {
	
	@NotNull(message = "회사 id를 입력해주세요.")
	private long companyId;
	
	@NotBlank(message = "채용포지션을 입력해주세요.")
	private String position;
	
	@NotNull(message = "채용보상금을 입력해주세요.")
	private int reward;
	
	@NotBlank(message = "채용내용을 입력해주세요.")
	private String detail;
	
	@NotBlank(message = "사용기술을 입력해주세요.")
	private String technologies;
	
	// resquest dto 로 받은 객체를 entity 화하여 저장하는 용도
	public Recruit toEntity() {
		return Recruit.builder().company(new Company(companyId))
				.position(position)
				.reward(reward)
				.detail(detail)
				.technologies(technologies).build();
	}
	
}
