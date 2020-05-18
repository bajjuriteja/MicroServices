package com.capgemini.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.TheaterRepo;
import com.capgemini.entity.Theater;

@Service
@Transactional

public class TheaterService {

	@Autowired
	TheaterRepo repo;

	public Theater addTheater(Theater theater) {

		Theater t = repo.save(theater);
		return t;

	}

}
