package com.formula.likeitboo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tt")
public class DemoController {

	@RequestMapping("/test")
	public String Test() {
		return "OK";	
	}

}
