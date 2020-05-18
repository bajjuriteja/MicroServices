package com.capgemini.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.ScreenRepo;

@Service
@Transactional
public class ScreenService {

	@Autowired
	ScreenRepo srep;

	public void deleteScreen(int id) {
		srep.deleteById(id);
	}

}
