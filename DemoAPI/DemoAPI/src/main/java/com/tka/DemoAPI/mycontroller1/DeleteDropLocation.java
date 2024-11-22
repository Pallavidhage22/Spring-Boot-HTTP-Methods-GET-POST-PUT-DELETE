package com.tka.DemoAPI.mycontroller1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Uber")
public class DeleteDropLocation {

	@RequestMapping(value="/DropLocation",method=RequestMethod.DELETE)
    public String FirstAPI() {
    	return"Your Drop location is Mahabaleshwar";
    }
}


