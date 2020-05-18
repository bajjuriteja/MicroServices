package com.capgemini.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.ScreenRepo;
import com.capgemini.entity.Screen;
import com.capgemini.entity.Theater;

@Service

@Transactional

public class ScreenService {

	@Autowired
	ScreenRepo srep;

	public void addScreen(Screen screen, int id) {
		Theater theater = new Theater();

		theater.setTheaterid(id);

		screen.setTheater(theater);

		srep.save(screen);

	}

}
