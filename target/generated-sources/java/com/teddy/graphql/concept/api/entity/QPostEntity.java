package com.teddy.graphql.concept.api.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPostEntity is a Querydsl query type for PostEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPostEntity extends EntityPathBase<Post> {

    private static final long serialVersionUID = -1842994148L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPostEntity postEntity = new QPostEntity("postEntity");

    public final QAuthorEntity authorEntity;

    public final StringPath category = createString("category");

    public final StringPath id = createString("id");

    public final StringPath text = createString("text");

    public final StringPath title = createString("title");

    public QPostEntity(String variable) {
        this(Post.class, forVariable(variable), INITS);
    }

    public QPostEntity(Path<? extends Post> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPostEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPostEntity(PathMetadata metadata, PathInits inits) {
        this(Post.class, metadata, inits);
    }

    public QPostEntity(Class<? extends Post> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.authorEntity = inits.isInitialized("authorEntity") ? new QAuthorEntity(forProperty("authorEntity")) : null;
    }

}

