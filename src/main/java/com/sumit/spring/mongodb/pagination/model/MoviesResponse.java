package com.sumit.spring.mongodb.pagination.model;

import java.util.List;
//import java.util.UUID;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class MoviesResponse {
   // private UUID queryId;
    private List<Movies> movies;
    private Integer currentPage;
    private Integer totalPages;
    private Integer pageSize;
    private Long totalRecords;
}
