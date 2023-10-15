package kr.co.wanted.Apply.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import kr.co.wanted.Apply.dto.ApplyCreate;
import kr.co.wanted.Apply.dto.QApplyResponse;
import lombok.RequiredArgsConstructor;

import static kr.co.wanted.Apply.entity.QApply.apply;

@RequiredArgsConstructor
public class ApplyRepositoryImpl implements ApplyRepositoryCustom {
	
	private final JPAQueryFactory queryFactory;
	
	@Override
	public int findAllCount(ApplyCreate applyCreate) {
		int result = (int) queryFactory
				.select(
						new QApplyResponse(
								apply.applyId
								, apply.member.memberId
								, apply.recruitId
						)
				)
				.from(apply)
				.where(
						apply.member.memberId.eq(applyCreate.getMemberId())
						.and(apply.recruitId.eq(applyCreate.getRecruitId()))
				)
				.fetchCount();
		
		return result;
	}
}
