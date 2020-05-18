package com.capgemini.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capgemini.entity.Theater;
import com.capgemini.service.TheaterService;



@Controller
@CrossOrigin("http://localhost:4200")
public class TheaterController {

	@Autowired
	TheaterService ser;
	
	
	@RequestMapping("/")
	
	public String addTheater()
	{
		
		
		return "Itheater";
		
	}
	
	/*
	 * @RequestMapping("add")
	 * 
	 * public String add(Theater theater) {
	 * 
	 * System.out.println(theater);
	 * 
	 * trep.save(theater);
	 * 
	 * 
	 * 
	 * System.out.println("theater added"); return "home";
	 * 
	 * 
	 * 
	 * }
	 * 
	 * 
	 */
	@RequestMapping("/theaterDelete")
	
	public String deleteTheater()
	{
		
		
		return "Dtheater";
		
	}
	
	@RequestMapping("delete")
	
	public String delete(@RequestParam("id") int id)
	{
		
		
		System.out.println(id);
		
		ser.deleteTheater(id); 

		
		
		System.out.println("theater deleted");
		return "home";
		
		
		
	}

			
		 
		  
		  
	
	
	
	
	
	@DeleteMapping("deleteRestTheater/{id}")
	
	public void deleteTheater(@PathVariable  int id)
	{
		ser.deleteTheater(id);
	}
	
	
	
}
