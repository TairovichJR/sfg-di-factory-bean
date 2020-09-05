package guru.springframework.service;

import guru.springframework.repos.GreetingRepository;

public class PrimaryEnglishGreetingService implements GreetingService{

	
	private GreetingRepository greetingRepository;

    public PrimaryEnglishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
