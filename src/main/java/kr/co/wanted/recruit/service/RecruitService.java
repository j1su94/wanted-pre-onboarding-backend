package kr.co.wanted.recruit.service;

import kr.co.wanted.recruit.dto.RecruitCreate;
import kr.co.wanted.recruit.dto.RecruitResponse;
import kr.co.wanted.recruit.dto.RecruitUpdate;

import java.util.List;

public interface RecruitService {
	
	Long insertRecruit(RecruitCreate recruitCreate);
	
	Long updateRecruit(long id, RecruitUpdate recruitUpdate);
	
	List<RecruitResponse> selectAllRecruitByKeword(String keyword);
	
	RecruitResponse selectRecruitDetail(long id);
	
	Long removeRecruit(long id);
}
