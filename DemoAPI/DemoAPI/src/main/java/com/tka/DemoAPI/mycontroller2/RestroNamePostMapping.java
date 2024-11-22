package com.tka.DemoAPI.mycontroller2;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Restaurant")
public class RestroNamePostMapping {

	@PostMapping("/RestroName")
	public String SecondAPI() {
		return "Restaurant name is Toscano";
	}
}
