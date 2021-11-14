package com.hello.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/hello")
public class HelloController {

	@GetMapping(value={"","/"})
	public String enter(){
		return "Hello";
	}

}
