package kr.co.wanted.recruit.repository;

import kr.co.wanted.recruit.dto.RecruitResponse;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecruitRepositoryCustom {
	
	List<RecruitResponse> findAllRecruitByKeword(String keyword);
	
	RecruitResponse findRecruitDetail(long id);
	
	List<Long> findAllByCompanyId(Long companyId);
	
}