
package com.Thakur_Assignment0;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Thakur_Assignment0Controller {
	
	@RequestMapping("/index")
	public String start() {
		return "index";
		
	}
}
