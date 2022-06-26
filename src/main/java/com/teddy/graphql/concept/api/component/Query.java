package com.teddy.graphql.concept.api.component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.teddy.graphql.concept.api.entity.Post;
import com.teddy.graphql.concept.api.repository.PostRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Query implements GraphQLQueryResolver {
  private final PostRepository postRepository;

  public List<Post> getRecentPosts(int count, int offset) {
    return postRepository.getRecentPosts(count, offset);
  }
}
