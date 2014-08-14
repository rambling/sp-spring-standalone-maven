package sample.service.impl;

import org.springframework.stereotype.Component;

import sample.service.HelloService;

@Component
public class HelloServiceImpl implements HelloService{

	@Override
	public String getMessage() {
		return "Hello world, Simple java app with maven.";
	}

}
