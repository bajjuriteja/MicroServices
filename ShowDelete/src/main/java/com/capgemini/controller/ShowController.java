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

	public String deleteScreen() {

		return "Dshow";

	}

	@RequestMapping("deleteShow")

	public String delete(@RequestParam("id") int id) {

		System.out.println(id);

		ser.deleteShow(id);

		System.out.println("show deleted");
		return "home";

	}

	@DeleteMapping("deleteRestShow/{id}")

	public void deleteShow(@PathVariable int id) {
		ser.deleteShow(id);

	}

}
