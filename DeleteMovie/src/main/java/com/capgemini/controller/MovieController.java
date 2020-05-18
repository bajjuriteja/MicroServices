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

	public String deleteScreen() {

		return "Dmovie";

	}

	@RequestMapping("deleteMovie")

	public String delete(@RequestParam("id") int id) {

		System.out.println(id);

		ser.deleteMovie(id);

		System.out.println("movie deleted");
		return "home";

	}

	@DeleteMapping("deleteRestMovie/{id}")

	public void deleteMovie(@PathVariable int id) {
		ser.deleteMovie(id);

	}

}
