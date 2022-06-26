package com.teddy.graphql.concept.api.config;

import com.teddy.graphql.concept.api.component.AuthorResolver;
import com.teddy.graphql.concept.api.component.Mutation;
import com.teddy.graphql.concept.api.component.PostResolver;
import com.teddy.graphql.concept.api.component.Query;
import com.teddy.graphql.concept.api.repository.AuthorRepository;
import com.teddy.graphql.concept.api.repository.PostRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphqlConfig {

  @Bean
  public PostResolver postResolver(AuthorRepository authorRepository) {
    return new PostResolver(authorRepository);
  }

  @Bean
  public AuthorResolver authorResolver(PostRepository postRepository) {
    return new AuthorResolver(postRepository);
  }

  @Bean
  public Query query(PostRepository postRepository) {
    return new Query(postRepository);
  }

  @Bean
  public Mutation mutation(PostRepository postRepository, AuthorRepository authorRepository) {
    return new Mutation(postRepository, authorRepository);
  }
}
