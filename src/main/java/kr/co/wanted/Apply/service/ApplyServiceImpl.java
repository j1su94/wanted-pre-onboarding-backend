package kr.co.wanted.Apply.service;

import kr.co.wanted.Apply.dto.ApplyCreate;
import kr.co.wanted.Apply.repository.ApplyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplyServiceImpl implements ApplyService {
	
	private final ApplyRepository applyRepo;
	
	@Override
	public Long insertApply(ApplyCreate applyCreate) {
		int applyCnt = applyRepo.findAllCount(applyCreate);
		
		if(applyCnt > 0) {
			return (long) 0;
		}
		
		// 저장 후 생성한 id 반환
		return applyRepo.save(applyCreate.toEntity()).getApplyId();
	}
	
}
