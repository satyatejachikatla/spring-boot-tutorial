package com.satyateja.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.satyateja.demo.dao.AlienRepo;
import com.satyateja.demo.model.Alien;

@RestController
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "index.html";
	}

	@RequestMapping("/addAlien")
	@ResponseBody
	public String addAlien(Alien alien) {
		repo.save(alien);
		return alien.toString();
	}

	@RequestMapping("/aliens")
	@ResponseBody
	public List<Alien> aliens() {
		return repo.findAll();
	}

	@GetMapping("/alien/{aid}")
	@ResponseBody
	public Optional<Alien> alienget(@PathVariable("aid") int aid) {
		return Optional.ofNullable(repo.findByAid(aid));
	}

	@PostMapping("/alien")
	@ResponseBody
	public Alien alienpost(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;
	}
	
}
