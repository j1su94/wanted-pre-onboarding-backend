package kr.co.wanted.Apply.service;

import kr.co.wanted.Apply.dto.ApplyCreate;

public interface ApplyService {
	
	Long insertApply(ApplyCreate applyCreate);
	
}