package com.sumit.spring.mongodb.pagination.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.spring.mongodb.pagination.model.MoviesResponse;
import com.sumit.spring.mongodb.pagination.service.MoviesServiceHandler;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MoviesController {

    private final MoviesServiceHandler moviesServiceHandler;

    @GetMapping(value = "/movies")
    public ResponseEntity<MoviesResponse> getAllMovies( @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int size) {

       var moviesResponses= moviesServiceHandler.getAllMoviesByNoSortOrder(page,size);
       return new ResponseEntity<>(moviesResponses, HttpStatus.OK);
    }
//TODO: Implement search by Movie Title, generes, single field Sort, multi field sort, 
}
