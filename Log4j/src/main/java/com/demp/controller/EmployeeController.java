package com.demp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/diplay")
	public String Show() {
		logger.trace("This is a TRACE message.");
		logger.debug("This is a DEBUG message.");
		logger.info("This is an INFO message.");
		logger.warn("This is a WARN message.");
		logger.error("You guessed it, an ERROR message.");
		return "Cherry java";

	}

}
// i want to change the code
