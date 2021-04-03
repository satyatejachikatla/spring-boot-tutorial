package com.satyateja.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satyateja.demo.model.Alien;

public interface AlienRepo extends JpaRepository<Alien,Integer> {
	Alien findByAid(int aid);
}
