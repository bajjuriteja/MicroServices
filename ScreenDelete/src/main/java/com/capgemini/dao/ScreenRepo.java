package com.capgemini.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.capgemini.entity.Screen;

public interface ScreenRepo extends JpaRepository<Screen, Integer> {

}
