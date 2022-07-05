package com.teddy.graphql.concept.api.component;

import com.teddy.graphql.concept.api.entity.Author;
import com.teddy.graphql.concept.api.entity.Post;
import com.teddy.graphql.concept.api.repository.AuthorRepository;
import com.teddy.graphql.concept.api.repository.PostRepository;
import java.util.UUID;

import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Mutation implements GraphQLMutationResolver {
  private final PostRepository postRepository;
  private final AuthorRepository authorRepository;

  public Post writePost(String title, String text, String category, String author) {
    Post post = new Post();
    post.setId(UUID.randomUUID().toString());
    post.setTitle(title);
    post.setText(text);
    post.setCategory(category);

    Author authorEntity = authorRepository.findById(author).orElse(null);
    post.setAuthor(authorEntity);

    return postRepository.save(post);
  }

  public Post getWritePost(String title, String text, String category) {
    Post post = new Post();
    post.setId(UUID.randomUUID().toString());
    post.setTitle(title);
    post.setText(text);
    post.setCategory(category);


    return postRepository.save(post);
  }
}
