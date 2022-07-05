# graphql-concept-api

## RUN

```bash
mvn spring-boot:run
```

## Graphiql 접속

- http://localhost:8080/graphiql
- 쿼리 입력 후 상단 요청 버튼 클릭하여 응답 데이터 확인
- 요청
```text
query recentPosts {
  recentPosts(count: 5, offset: 0){
    id,
    title,
    text,
    category,
    author {
      id,
      name,
      thumbnail
    }
  }
}
```

- 응답
```text
{
  "data": {
    "recentPosts": [
      {
        "id": "1",
        "title": "POST 1",
        "text": "POST TEXT 1",
        "category": "POST CATEGORY 1",
        "author": {
          "id": "1",
          "name": "AUTHOR 1 NAME",
          "thumbnail": "AUTHOR 1 THUMBNAIL"
        }
      }
    ]
  }
}
```

## Graphql Library
- https://github.com/graphql-java-kickstart/graphql-spring-boot/blob/master/README.md

