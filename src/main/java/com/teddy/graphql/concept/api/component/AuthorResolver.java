package com.teddy.graphql.concept.api.component;

import com.teddy.graphql.concept.api.entity.Author;
import com.teddy.graphql.concept.api.entity.Post;
import com.teddy.graphql.concept.api.repository.PostRepository;
import java.util.List;

import graphql.kickstart.tools.GraphQLResolver;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AuthorResolver implements GraphQLResolver<Author> {
  private final PostRepository postRepository;

  public List<Post> getPosts(Author author) {
    return postRepository.getAuthorPosts(author.getId());
  }
}
