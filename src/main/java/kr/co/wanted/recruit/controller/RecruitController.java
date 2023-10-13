package kr.co.wanted.recruit.controller;

import jakarta.validation.Valid;
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
	
	@PostMapping("/create")
	@ResponseBody
	public Long createRecruit(@RequestBody @Valid RecruitCreate recruitCreate) {
		return recruitService.insertRecruit(recruitCreate);
	}
	
	@GetMapping("/list")
	@ResponseBody
	public List<RecruitResponse> searchAllRecruitByKeword(@RequestParam(name = "search", required = false, defaultValue = "") String search) {
		return recruitService.selectAllRecruitByKeword(search);
	}
	
	@GetMapping("/detail/{id}")
	@ResponseBody
	public RecruitResponse searchRecruitDetail(@PathVariable long id) {
		return recruitService.selectRecruitDetail(id);
	}
	
	@PutMapping("/edit/{id}")
	public Long editRecruit(@PathVariable long id, @RequestBody @Valid RecruitUpdate recruitUpdate) {
		return recruitService.updateRecruit(id, recruitUpdate);
	}
	
	@DeleteMapping("/remove/{id}")
	public Long removeRecruit(@PathVariable long id) {
		return recruitService.removeRecruit(id);
	}
	
}
