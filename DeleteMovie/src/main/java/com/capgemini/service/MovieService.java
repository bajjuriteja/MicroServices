package com.capgemini.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.MovieRepo;
import com.capgemini.entity.Movie;

@Service
@Transactional
public class MovieService {

	@Autowired
	MovieRepo mrep;

	public void deleteMovie(int id) {
		Movie movie = mrep.getOne(id);

		mrep.delete(movie);

	}

}
