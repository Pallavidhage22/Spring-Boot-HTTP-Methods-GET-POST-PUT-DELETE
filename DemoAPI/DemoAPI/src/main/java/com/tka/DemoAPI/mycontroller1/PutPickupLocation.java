package com.tka.DemoAPI.mycontroller1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Uber")
public class PutPickupLocation {

	@RequestMapping(value="/PickupLocation",method=RequestMethod.PUT)
    public String FirstAPI() {
    	return"Your Pickup location is Pune";
    }
}

