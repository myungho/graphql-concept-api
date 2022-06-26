package com.teddy.graphql.concept.api.repository;

import com.teddy.graphql.concept.api.entity.Post;
import java.util.List;

public interface PostRepositoryCustom {

  List<Post> getRecentPosts(int count, int offset);

  List<Post> getAuthorPosts(String id);
}
