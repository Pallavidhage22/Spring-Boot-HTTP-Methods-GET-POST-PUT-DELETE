package com.tka.DemoAPI.mycontroller1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Uber")
public class PostBookRide {

	@RequestMapping(value="/BookRide",method=RequestMethod.POST)
    public String FirstAPI() {
    	return"your ride is confirmed";
    }
}
