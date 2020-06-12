package com.centime.greetingservice.services.impl;

import org.springframework.stereotype.Service;

import com.centime.greetingservice.services.GreetingService;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * Greeting Service will be used to send the greeting to the user. It contains
 * one greeting method which when invoked returns a "Hello" String. The string
 * itself can be kept in a constant file or may be using a strategy(to apply
 * open closed principle)
 * 
 * @author prkala
 *
 */
@Service
@Slf4j
public class HelloGreetingServiceImpl implements GreetingService {

	@Override
	public String greeting() {
		log.debug("Greeting method called");
		return "Hello";
	}
}
