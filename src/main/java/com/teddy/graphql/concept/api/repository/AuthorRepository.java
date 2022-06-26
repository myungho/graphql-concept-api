package com.teddy.graphql.concept.api.repository;

import com.teddy.graphql.concept.api.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository
    extends JpaRepository<Author, String> {}
