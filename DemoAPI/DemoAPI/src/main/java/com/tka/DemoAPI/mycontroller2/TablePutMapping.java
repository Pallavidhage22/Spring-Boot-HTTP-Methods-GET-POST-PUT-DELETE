package com.tka.DemoAPI.mycontroller2;


import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Restaurant")
public class TablePutMapping {

	@PutMapping("/BookTable")
	public String ThirdAPI() {
		return "Your table is booked";
	}
}
