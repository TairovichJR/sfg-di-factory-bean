package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.controllers.EnglishGreetingController;
import guru.springframework.controllers.GermanGreetingController;
import guru.springframework.controllers.SpanishGreetingController;
import guru.springframework.examplebeans.FakeDataSource;
import guru.springframework.examplebeans.FakeJmsBroker;

@SpringBootApplication
public class SfgDi1Application {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(SfgDi1Application.class, args);

//		((EnglishGreetingController)ctx.getBean(EnglishGreetingController.class)).getEnglishGreeting();
//		
//		
//		System.out.println(((EnglishGreetingController)ctx.getBean(EnglishGreetingController.class)).getEnglishGreeting());
//		System.out.println(((GermanGreetingController)ctx.getBean(GermanGreetingController.class)).getGermalGreeting());
//		System.out.println(((SpanishGreetingController)ctx.getBean(SpanishGreetingController.class)).getSpanishGreeting());
//		
	
	
		FakeDataSource fakeDataSource = (FakeDataSource)ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUser());
		System.out.println(fakeDataSource.getUrl());
		
		
		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker)ctx.getBean(FakeJmsBroker.class);
		System.out.println(fakeJmsBroker.getUser());
		System.out.println(fakeJmsBroker.getUrl());
		
		
		
		
		
	}

}
