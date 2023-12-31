package kr.co.wanted.recruit.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRecruit is a Querydsl query type for Recruit
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRecruit extends EntityPathBase<Recruit> {

    private static final long serialVersionUID = 260253831L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRecruit recruit = new QRecruit("recruit");

    public final kr.co.wanted.company.entity.QCompany company;

    public final StringPath detail = createString("detail");

    public final StringPath position = createString("position");

    public final NumberPath<Long> recruitId = createNumber("recruitId", Long.class);

    public final NumberPath<Integer> reward = createNumber("reward", Integer.class);

    public final StringPath technologies = createString("technologies");

    public QRecruit(String variable) {
        this(Recruit.class, forVariable(variable), INITS);
    }

    public QRecruit(Path<? extends Recruit> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRecruit(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRecruit(PathMetadata metadata, PathInits inits) {
        this(Recruit.class, metadata, inits);
    }

    public QRecruit(Class<? extends Recruit> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.company = inits.isInitialized("company") ? new kr.co.wanted.company.entity.QCompany(forProperty("company")) : null;
    }

}

