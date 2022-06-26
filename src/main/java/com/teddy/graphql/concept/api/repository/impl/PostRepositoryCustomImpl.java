package com.teddy.graphql.concept.api.repository.impl;

import com.querydsl.core.QueryResults;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.teddy.graphql.concept.api.entity.Post;
import com.teddy.graphql.concept.api.entity.QPostEntity;
import com.teddy.graphql.concept.api.repository.PostRepositoryCustom;
import java.util.List;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

public class PostRepositoryCustomImpl extends QuerydslRepositorySupport
    implements PostRepositoryCustom {

  private final JPAQueryFactory jpaQueryFactory;
  private QPostEntity qPostEntity = QPostEntity.postEntity;

  public PostRepositoryCustomImpl(JPAQueryFactory jpaQueryFactory) {
    super(Post.class);
    this.jpaQueryFactory = jpaQueryFactory;
  }

  @Override
  public List<Post> getRecentPosts(int count, int offset) {
    JPAQuery<Post> jpaQuery =
        jpaQueryFactory
            .selectFrom(qPostEntity)
            .offset(offset)
            .limit(count);

    // querydsl fetchResults 는 페이징시 select count 쿼리를 선 실행
    // group by, having 절이 포함되는 복잡한 쿼리에서 예외 발생하는 경우가 있어 deprecated 처리됨.
    QueryResults<Post> list = jpaQuery.fetchResults();
    return list.getResults();
  }

  @Override
  public List<Post> getAuthorPosts(String id) {
    return null;
  }
}
