package com.teddy.graphql.concept.api.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name = "AUTHOR")
public class Author {

  @Id
  @Column(name = "ID")
  String id;

  @NotNull
  @Column(name = "NAME")
  String name;

  @NotNull
  @Column(name = "THUMBNAIL")
  String thumbnail;

  @Column(name = "CATEGORY")
  String category;

  @OneToMany(mappedBy = "author")
  @ToString.Exclude
  private List<Post> postList;

}
