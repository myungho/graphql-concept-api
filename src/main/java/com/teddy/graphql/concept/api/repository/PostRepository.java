package com.teddy.graphql.concept.api.repository;

import com.teddy.graphql.concept.api.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, String>, PostRepositoryCustom {}
