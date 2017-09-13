package com.springbootweblogic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resource")
public class ResourceController {
	// http://localhost:8080/resource
    @RequestMapping(method = RequestMethod.GET)
    String readResource() {
        return "hello!";
    }
}