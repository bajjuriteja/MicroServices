package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capgemini.entity.Movie;
import com.capgemini.service.MovieService;

@Controller
@CrossOrigin("http://localhost:4200")
public class MovieController {

	@Autowired
	MovieService ser;

	@RequestMapping("/")

	public String addMovie() {

		return "Imovie";

	}

	@RequestMapping("addMovie")

	public String add(Movie movie) {

		System.out.println(movie);

		ser.addMovie(movie);

		System.out.println("movie added");
		return "home";

	}

	@PostMapping("addRestMovie")

	public Movie addTheater(@RequestBody Movie movie) {

		System.out.println(movie);

		ser.addMovie(movie);

		System.out.println("movie added");

		return movie;

	}

}
