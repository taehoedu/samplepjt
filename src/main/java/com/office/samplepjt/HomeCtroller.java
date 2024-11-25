package com.office.samplepjt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Controller
public class HomeCtroller {

	@GetMapping({"", "/"})
	public String home() {
		log.info("home()");
		
		String nextPage = "home";
		
		return nextPage;
		
	}
	
}
