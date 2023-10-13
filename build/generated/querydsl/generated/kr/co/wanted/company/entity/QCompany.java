package kr.co.wanted.company.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCompany is a Querydsl query type for Company
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCompany extends EntityPathBase<Company> {

    private static final long serialVersionUID = -1266146649L;

    public static final QCompany company = new QCompany("company");

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath companyName = createString("companyName");

    public final StringPath country = createString("country");

    public final ListPath<kr.co.wanted.recruit.entity.Recruit, kr.co.wanted.recruit.entity.QRecruit> recruitList = this.<kr.co.wanted.recruit.entity.Recruit, kr.co.wanted.recruit.entity.QRecruit>createList("recruitList", kr.co.wanted.recruit.entity.Recruit.class, kr.co.wanted.recruit.entity.QRecruit.class, PathInits.DIRECT2);

    public final StringPath region = createString("region");

    public QCompany(String variable) {
        super(Company.class, forVariable(variable));
    }

    public QCompany(Path<? extends Company> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCompany(PathMetadata metadata) {
        super(Company.class, metadata);
    }

}

