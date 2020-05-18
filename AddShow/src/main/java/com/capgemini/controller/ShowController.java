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

import com.capgemini.entity.Screen;
import com.capgemini.entity.Show;
import com.capgemini.service.ShowService;

@Controller
@CrossOrigin("http://localhost:4200")
public class ShowController {

	@Autowired
	ShowService ser;

	@RequestMapping("/")
	public String addShow() {

		return "Ishow";

	}

	@RequestMapping("addShow")

	public String add(Show show, @RequestParam("screen_screenid") int id) {

		System.out.println(show + "" + id);

		ser.addShow(show, id);

		System.out.println("show added");

		return "home";

	}

	@PostMapping("addRestShow/{id}")

	public Show addTheater(@RequestBody Show show, @PathVariable int id) {

		System.out.println(show);

		ser.addShow(show, id);

		System.out.println("Show added");

		return show;

	}

}
