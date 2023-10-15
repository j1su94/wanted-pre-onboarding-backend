package kr.co.wanted.recruit.service;

import jakarta.transaction.Transactional;
import kr.co.wanted.Apply.dto.ApplyCreate;
import kr.co.wanted.recruit.dto.RecruitCreate;
import kr.co.wanted.recruit.dto.RecruitResponse;
import kr.co.wanted.recruit.dto.RecruitUpdate;
import kr.co.wanted.recruit.entity.Recruit;
import kr.co.wanted.recruit.repository.RecruitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecruitServiceImpl implements RecruitService {
	
	private final RecruitRepository recruitRepo;
	
	@Override
	public Long insertRecruit(RecruitCreate recruitCreate) {
		// 저장 후 생성한 id 반환
		return recruitRepo.save(recruitCreate.toEntity()).getRecruitId();
	}
	
	@Override
	@Transactional
	public Long updateRecruit(long id, RecruitUpdate recruitUpdate) {
		Recruit recruit = recruitRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 채용공고가 없습니다. id = " + id));
		recruit.update(recruitUpdate.getPosition(), recruitUpdate.getReward(), recruitUpdate.getDetail(), recruitUpdate.getTechnologies());
		
		return id;
	}
	
	@Override
	public Long removeRecruit(long id) {
		recruitRepo.deleteById(id);
		
		return id;
	}
	
	@Override
	public List<RecruitResponse> selectAllRecruitByKeword(String keyword) {
		return recruitRepo.findAllRecruitByKeword(keyword);
	}
	
	@Override
	public RecruitResponse selectRecruitDetail(long id) {
		RecruitResponse result = recruitRepo.findRecruitDetail(id);
		
		Long companyId = recruitRepo.findById(id).orElseThrow().getCompany().getCompanyId();
		List<Long> otherRecruitList = recruitRepo.findAllByCompanyId(companyId);
		
		result.setOtherRecruitList(otherRecruitList);
		
		return result;
	}
	
}
