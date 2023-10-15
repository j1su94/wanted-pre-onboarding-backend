package kr.co.wanted.Apply.controller;

import jakarta.validation.Valid;
import kr.co.wanted.Apply.dto.ApplyCreate;
import kr.co.wanted.Apply.service.ApplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/apply")
public class ApplyController {
	
	private final ApplyService applyService;
	
	/**
	 * 요구사항 6. 채용공고 지원
	 * @return
	 */
	@PostMapping("/create")
	public Long createApply(@RequestBody @Valid ApplyCreate applyCreate) {
		return applyService.insertApply(applyCreate);
	}
	
}