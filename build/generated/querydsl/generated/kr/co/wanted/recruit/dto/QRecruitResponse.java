package kr.co.wanted.recruit.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.processing.Generated;

/**
 * kr.co.wanted.recruit.dto.QRecruitResponse is a Querydsl Projection type for RecruitResponse
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QRecruitResponse extends ConstructorExpression<RecruitResponse> {

    private static final long serialVersionUID = -2129207428L;

    public QRecruitResponse(com.querydsl.core.types.Expression<Long> recruitId, com.querydsl.core.types.Expression<String> companyName, com.querydsl.core.types.Expression<String> country, com.querydsl.core.types.Expression<String> region, com.querydsl.core.types.Expression<String> position, com.querydsl.core.types.Expression<Integer> reward, com.querydsl.core.types.Expression<String> technologies) {
        super(RecruitResponse.class, new Class<?>[]{long.class, String.class, String.class, String.class, String.class, int.class, String.class}, recruitId, companyName, country, region, position, reward, technologies);
    }

    public QRecruitResponse(com.querydsl.core.types.Expression<Long> recruitId, com.querydsl.core.types.Expression<String> companyName, com.querydsl.core.types.Expression<String> country, com.querydsl.core.types.Expression<String> region, com.querydsl.core.types.Expression<String> position, com.querydsl.core.types.Expression<Integer> reward, com.querydsl.core.types.Expression<String> technologies, com.querydsl.core.types.Expression<String> detail) {
        super(RecruitResponse.class, new Class<?>[]{long.class, String.class, String.class, String.class, String.class, int.class, String.class, String.class}, recruitId, companyName, country, region, position, reward, technologies, detail);
    }

}

