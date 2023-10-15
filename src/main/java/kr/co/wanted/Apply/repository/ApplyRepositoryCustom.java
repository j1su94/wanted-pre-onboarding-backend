package kr.co.wanted.Apply.repository;

import kr.co.wanted.Apply.dto.ApplyCreate;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplyRepositoryCustom {
	
	int findAllCount(ApplyCreate applyCreate);
	
}