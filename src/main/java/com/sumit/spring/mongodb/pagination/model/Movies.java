package com.sumit.spring.mongodb.pagination.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "movies")
@Setter
@Getter
@NoArgsConstructor
public class Movies {
    @Id
    public String id;
    public String movieId;
    public String title;
    public String genres;
}
