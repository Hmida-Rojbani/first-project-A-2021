package de.tekup.first.project.services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	public String hello() {
		return "Hello World!!";
	}
	
	public String helloName(String name) {
		return "Welcome "+name+"!!";
	}

}
