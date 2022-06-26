package com.teddy.graphql.concept.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
@Entity
@Table(name = "POST")
public class Post {
  @Id
  @Column(name = "ID")
  String id;

  @NotNull
  @Column(name = "TITLE")
  String title;

  @NotNull
  @Column(name = "TEXT")
  String text;

  @Column(name = "CATEGORY")
  String category;

  @ManyToOne
  @JoinColumn(name = "AUTHOR_ID")
  @ToString.Exclude
  private Author author;
}
