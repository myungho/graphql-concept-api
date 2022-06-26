package com.teddy.graphql.concept.api;

import com.teddy.graphql.concept.api.config.GraphqlConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

// @EnableWebMvc
@SpringBootApplication
@Import(GraphqlConfig.class)
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
