package com.teddy.graphql.concept.api.component;

import com.teddy.graphql.concept.api.entity.Author;
import com.teddy.graphql.concept.api.entity.Post;
import com.teddy.graphql.concept.api.repository.AuthorRepository;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PostResolver implements GraphQLResolver<Post> {
  private final AuthorRepository authorRepository;

  public Author getAuthor(Post post) {
    return authorRepository.findById(post.getAuthor().getId()).orElseThrow(RuntimeException::new);
  }

  public Author getFirst_author(Post post) {
    return authorRepository.findById(post.getAuthor().getId()).orElseThrow(RuntimeException::new);
  }
}
