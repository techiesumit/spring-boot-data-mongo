package com.sumit.spring.mongodb.pagination.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.sumit.spring.mongodb.pagination.model.Movies;
import com.sumit.spring.mongodb.pagination.model.MoviesResponse;
import com.sumit.spring.mongodb.pagination.repository.MoviesRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class MoviesServiceHandler {
    private final MoviesRepository moviesRepository;

    public MoviesResponse getAllMoviesByNoSortOrder(int page, int size) {
        Pageable paginPageable = PageRequest.of(page, size);
         Page<Movies> pageWithMovies = moviesRepository.findAll(paginPageable);
        return createResponse(pageWithMovies);
    }

    private MoviesResponse createResponse(Page<Movies> pageWithMovies) {
        return MoviesResponse.builder()
                .movies(pageWithMovies.getContent())
                .currentPage(pageWithMovies.getNumber())
                .totalPages(pageWithMovies.getTotalPages())
                .totalRecords(pageWithMovies.getTotalElements())
                .pageSize(pageWithMovies.getSize())
                .build();
    }

}
