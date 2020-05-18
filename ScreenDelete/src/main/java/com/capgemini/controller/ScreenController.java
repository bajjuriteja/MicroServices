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

	public String deleteScreen() {

		return "Dscreen";

	}

	@RequestMapping("deleteScreen")

	public String delete(@RequestParam("id") int id) {

		System.out.println(id);

		ser.deleteScreen(id);

		System.out.println("screen deleted");
		return "home";

	}

	@DeleteMapping("deleteRestScreen/{id}")

	public void deleteScreen(@PathVariable int id) {
		ser.deleteScreen(id);
	}

}
