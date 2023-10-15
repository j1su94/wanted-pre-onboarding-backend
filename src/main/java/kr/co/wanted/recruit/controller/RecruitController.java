package kr.co.wanted.recruit.controller;

import jakarta.validation.Valid;
import kr.co.wanted.Apply.dto.ApplyCreate;
import kr.co.wanted.recruit.dto.RecruitCreate;
import kr.co.wanted.recruit.dto.RecruitResponse;
import kr.co.wanted.recruit.dto.RecruitUpdate;
import kr.co.wanted.recruit.service.RecruitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/recruit")
public class RecruitController {
	
	private final RecruitService recruitService;
	
	/**
	 * 요구사항 1. 채용공고 등록
	 * @param recruitCreate
	 * @return
	 */
	@PostMapping("/create")
	@ResponseBody
	public Long createRecruit(@RequestBody @Valid RecruitCreate recruitCreate) {
		return recruitService.insertRecruit(recruitCreate);
	}
	
	/**
	 * 요구사항 2. 채용공고 수정
	 * @param id
	 * @return
	 */
	@PutMapping("/edit/{id}")
	public Long editRecruit(@PathVariable long id, @RequestBody @Valid RecruitUpdate recruitUpdate) {
		return recruitService.updateRecruit(id, recruitUpdate);
	}
	
	/**
	 * 요구사항 3. 채용공고 삭제
	 * @param id
	 * @return
	 */
	@DeleteMapping("/remove/{id}")
	public Long removeRecruit(@PathVariable long id) {
		return recruitService.removeRecruit(id);
	}
	
	/**
	 * 요구사항 4. 채용공고 목록 조회 (4-1, 4-2 포함)
	 * @param search
	 * @return
	 */
	@GetMapping("/list")
	@ResponseBody
	public List<RecruitResponse> searchAllRecruitByKeword(@RequestParam(name = "search", required = false, defaultValue = "") String search) {
		return recruitService.selectAllRecruitByKeword(search);
	}
	
	/**
	 * 요구사항 5. 채용 상세 페이지 조회
	 * @param id
	 * @return
	 */
	@GetMapping("/detail/{id}")
	@ResponseBody
	public RecruitResponse searchRecruitDetail(@PathVariable long id) {
		return recruitService.selectRecruitDetail(id);
	}
	
}