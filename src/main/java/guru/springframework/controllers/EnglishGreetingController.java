package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.repos.GreetingRepository;


@Controller
public class EnglishGreetingController {

	@Autowired
	private GreetingRepository greetingRepository;
	
	
	public String getEnglishGreeting() {
		return greetingRepository.getEnglishGreeting();
	}
	
	
	
}
