package com.capgemini.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.capgemini.entity.Show;

public interface ShowRepo extends JpaRepository<Show, Integer> {

}
