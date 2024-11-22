package com.tka.DemoAPI.mycontroller2;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Restaurant")
public class CuisineDeleteMapping {

	@DeleteMapping("/Cuisine")
	public String FourthAPI() {
		return "Cuisine is Italian";
	}
}