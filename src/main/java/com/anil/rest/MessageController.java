package com.anil.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@GetMapping("/message")
	public String msgGreet() {
		return "Hi Anil";
	}
}
