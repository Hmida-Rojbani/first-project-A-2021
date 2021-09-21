package de.tekup.first.project.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.tekup.first.project.models.User;
import de.tekup.first.project.services.HelloService;

@RestController
public class HelloCtrl {
	
	//private HelloService service = new HelloService();
	
	private HelloService service;
	
	public HelloCtrl(HelloService service) {
		super();
		this.service = service;
	}

	//@RequestMapping(path="/hello", method = RequestMethod.GET)
	//@GetMapping("/hello")
	@RequestMapping(path="/hello", method = {RequestMethod.GET,RequestMethod.POST})
	public String sayHello() {
		return service.hello();
	}
	
	@RequestMapping(path="/hello/{value}")	
	public String sayHelloName(@PathVariable("value") String name) {
		return service.helloName(name);
	}

	@GetMapping("/create/{name}/{age}")
	public User createUser(@PathVariable("name") String name, @PathVariable("age") int age) {
		return new User(name,age);
	}
	
	@PostMapping("/create")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		user.setAge(50);
		return new ResponseEntity<User>(user, HttpStatus.CREATED);
	}
	

}
