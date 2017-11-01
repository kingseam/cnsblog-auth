package com.cnsblog.auth;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthTestController {

	@RequestMapping("/")
	public String main() {
		return "JWT Auth Server!!";
	}

	@RequestMapping("/hello")
	public String hello() {
		return "Hello auth";
	}

	@RequestMapping("/api/hello")
	public String hello2() {
		return "Hello api auth";
	}
}
