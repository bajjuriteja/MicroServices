package com.capgemini.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.capgemini.entity.Movie;

public interface MovieRepo extends JpaRepository<Movie, Integer> {

}
