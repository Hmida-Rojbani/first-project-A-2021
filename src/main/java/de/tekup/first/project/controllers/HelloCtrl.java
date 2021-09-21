package de.tekup.first.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.tekup.first.project.services.HelloService;

@RestController
public class HelloCtrl {
	
	//private HelloService service = new HelloService();
	
	private HelloService service;
	
	public HelloCtrl(HelloService service) {
		super();
		this.service = service;
	}

	@RequestMapping(path="/hello")	
	public String sayHello() {
		return service.hello();
	}
	
	@RequestMapping(path="/hello/{value}")	
	public String sayHelloName(@PathVariable("value") String name) {
		return service.helloName(name);
	}

	
	

}
