package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.capgemini.entity.Theater;
import com.capgemini.service.TheaterService;

@Controller
@CrossOrigin("http://localhost:4200")
public class TheaterController {

	@Autowired
	TheaterService ser;

	@RequestMapping("/")
	public String addTheater() {

		return "Dtheater";

	}

	@RequestMapping("delete")

	public String delete(@RequestParam("id") int id) {

		ser.deleteTh(id);

		System.out.println("theater deleted");

		return "home";

	}

	@DeleteMapping("deleteRestTheater/{id}")

	public void deleteTheater(@PathVariable int id) {
		ser.deleteTh(id);
	}

}
