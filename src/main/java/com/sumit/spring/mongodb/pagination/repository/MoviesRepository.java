package com.sumit.spring.mongodb.pagination.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sumit.spring.mongodb.pagination.model.Movies;

public interface MoviesRepository extends MongoRepository<Movies, String> {
 
}
