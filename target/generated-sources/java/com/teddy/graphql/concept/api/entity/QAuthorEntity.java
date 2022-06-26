package com.teddy.graphql.concept.api.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAuthorEntity is a Querydsl query type for AuthorEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAuthorEntity extends EntityPathBase<Author> {

    private static final long serialVersionUID = 986846855L;

    public static final QAuthorEntity authorEntity = new QAuthorEntity("authorEntity");

    public final StringPath category = createString("category");

    public final StringPath id = createString("id");

    public final StringPath name = createString("name");

    public final ListPath<Post, QPostEntity> postEntityList = this.<Post, QPostEntity>createList("postEntityList", Post.class, QPostEntity.class, PathInits.DIRECT2);

    public final StringPath thumbnail = createString("thumbnail");

    public QAuthorEntity(String variable) {
        super(Author.class, forVariable(variable));
    }

    public QAuthorEntity(Path<? extends Author> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuthorEntity(PathMetadata metadata) {
        super(Author.class, metadata);
    }

}

