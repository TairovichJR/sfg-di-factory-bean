package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.repos.GreetingRepository;


@Controller
public class SpanishGreetingController {

	@Autowired
	private GreetingRepository greetingRepository;

	public String getSpanishGreeting() {
		return greetingRepository.getSpanishGreeting();
	}
	
}
