package com.tka.DemoAPI.mycontroller2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Restaurant")
public class OrderGetMapping {

	@GetMapping("/Order")
	public String FirstAPI() {
		return "Your Order is Pizza Hut";
	}
	
}
