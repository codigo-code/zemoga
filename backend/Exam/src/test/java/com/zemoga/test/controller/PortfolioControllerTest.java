package com.zemoga.test.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Description;
import org.springframework.test.context.junit4.SpringRunner;

import com.zemoga.repositories.PortfolioRepository;


@RunWith(SpringRunner.class)	
@SpringBootTest
public class PortfolioControllerTest {

	@Autowired
	private PortfolioRepository pr;
	
	@Description(value="check pr isn't null")
	@Test
	void testInstance() {
		assertNotNull(pr);
	}
	
	@Description(value="check the first one of the list isn't null")
	@Test
	void checkApi() {
		assertEquals(pr.findById(1).get().getTwitterUserName().toString(), "GoT_Tyrion".toString());
	}
}
