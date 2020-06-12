package com.centime.greetingservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.centime.greetingservice.services.GreetingService;

/**
 * Greeting controller has one API method which returns the greeting to the
 * user.
 * 
 * @author prkala
 *
 */

@RestController
@RequestMapping("/v1/greeting")
public class GreetingController {

	@Autowired
	private GreetingService greetingService;

	@GetMapping
	public ResponseEntity<String> greeting() {
		return new ResponseEntity<String>(greetingService.greeting(), HttpStatus.OK);
	}
}
