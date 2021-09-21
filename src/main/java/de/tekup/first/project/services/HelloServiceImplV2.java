package de.tekup.first.project.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class HelloServiceImplV2 implements HelloService{
	public String hello() {
		return "Hello World!!!";
	}

	public String helloName(String name) {
		return "Welcome " + name + "!!!";
	}
}
