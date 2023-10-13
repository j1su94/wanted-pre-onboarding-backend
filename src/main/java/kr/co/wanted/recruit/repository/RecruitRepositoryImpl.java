package kr.co.wanted.recruit.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import kr.co.wanted.recruit.dto.QRecruitResponse;
import kr.co.wanted.recruit.dto.RecruitResponse;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static kr.co.wanted.company.entity.QCompany.company;
import static kr.co.wanted.recruit.entity.QRecruit.recruit;

@RequiredArgsConstructor
public class RecruitRepositoryImpl implements RecruitRepositoryCustom {
	
	private final JPAQueryFactory queryFactory;
	
	@Override
	public List<RecruitResponse> findAllRecruitByKeword(String keyword) {
		List<RecruitResponse> result = queryFactory
				.select(
						new QRecruitResponse(
								recruit.recruitId
								, company.companyName
								, company.country
								, company.region
								, recruit.position
								, recruit.reward
								, recruit.technologies
						)
				)
				.from(recruit)
				.innerJoin(recruit.company, company)
				.where(
						company.companyName.contains(keyword)
						.or(company.country.contains(keyword))
						.or(company.region.contains(keyword))
						.or(recruit.position.contains(keyword))
						.or(recruit.technologies.contains(keyword))
				)
				.fetch();
		
		return result;
	}
	
	@Override
	public RecruitResponse findRecruitDetail(long id) {
		RecruitResponse result =  queryFactory
				.select(
						new QRecruitResponse(
								recruit.recruitId
								, company.companyName
								, company.country
								, company.region
								, recruit.position
								, recruit.reward
								, recruit.technologies
								, recruit.detail
						)
				)
				.from(recruit)
				.innerJoin(recruit.company, company)
				.where(recruit.recruitId.eq(id))
				.fetchOne();
		
		return result;
	}
	
	@Override
	public List<Long> findAllByCompanyId(Long companyId) {
		List<Long> result = queryFactory
				.select(recruit.recruitId)
				.from(recruit)
				.innerJoin(recruit.company, company)
				.where(company.companyId.eq(companyId))
				.fetch();
		
		return result;
	}
	
	
	
}
