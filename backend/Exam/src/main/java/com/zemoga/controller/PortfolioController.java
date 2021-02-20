package com.zemoga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.zemoga.dto.Portfolio;
import com.zemoga.repositories.PortfolioRepository;
import com.zemoga.services.Twitter.TwitterIntegrationServiceImpl;

@CrossOrigin
@RestController
public class PortfolioController {

	@Autowired
	private PortfolioRepository portfolio;

	@Autowired
	private TwitterIntegrationServiceImpl twitter;

	@GetMapping("/getAllPortfolios")
	public ResponseEntity<List<Portfolio>> getAllPortfolios() {
		return ResponseEntity.ok(portfolio.findAll());
	}

	@GetMapping("/getAllPortfolios/{id}")
	public ResponseEntity<Portfolio> getPortfolioById(@PathVariable("id") int id) {
		try {
			return ResponseEntity.ok(portfolio.findById(id).get());

		} catch (Exception e) {
			System.err.println(e.getMessage());
			return ResponseEntity.ok(null).status(500).body(null);
		}
	}

	@GetMapping("/saludo")
	public String hola() {
		return "hola mundo";
	}

	@GetMapping("/twis")
	public List<String> getTwis() {

		return this.twitter.getLastTweetsFromUser("GoT_Tyrion");
	}
}
