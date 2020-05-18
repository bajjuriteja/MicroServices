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
import com.capgemini.entity.Theater;
import com.capgemini.service.ScreenService;

@Controller
@CrossOrigin("http://localhost:4200")
public class ScreenController {

	@Autowired
	ScreenService ser;

	@RequestMapping("/")

	public String addScreen() {

		return "Iscreen";

	}

	@RequestMapping("addScreen")

	public String add(Screen screen, @RequestParam("theater_theaterid") int id) {

		System.out.println(screen + "" + id);

		ser.addScreen(screen, id);

		System.out.println("screen added");
		return "home";

	}

	@PostMapping("addRestScreen/{id}")

	public Screen addScreen(@RequestBody Screen screen, @PathVariable int id) {

		System.out.println(screen);

		ser.addScreen(screen, id);

		System.out.println("screen added");

		return screen;

	}

}
