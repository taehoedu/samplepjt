package com.office.samplepjt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Controller
public class HomeController {

	@Value("${server.name}")
	private String serverName;
	
	@GetMapping({"", "/"})
	public String home() {
		log.info("home()");
		log.info("serverName: {}", serverName);
		
		String nextPage = "home";
		
		return nextPage;
		
	}
	
}
