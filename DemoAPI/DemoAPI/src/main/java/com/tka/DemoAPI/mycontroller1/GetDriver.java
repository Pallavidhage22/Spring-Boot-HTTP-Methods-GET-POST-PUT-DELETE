package com.tka.DemoAPI.mycontroller1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Uber")
public class GetDriver {

	@RequestMapping(value="/Driver",method=RequestMethod.GET)
    public String FirstAPI() {
    	return"Driver is now available";
    }
}
