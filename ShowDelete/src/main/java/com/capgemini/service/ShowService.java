package com.capgemini.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.ShowRepo;
import com.capgemini.entity.Screen;
import com.capgemini.entity.Show;

@Service
@Transactional
public class ShowService {

	@Autowired
	ShowRepo shrep;

	public void deleteShow(int id) {
		shrep.deleteById(id);
	}

}
