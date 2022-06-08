package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {

	@GetMapping("/test1")
	public String test1() {
		return "result";
	}
	
	@PostMapping("/test2")
	public String test2() {
		return "result";
	}	
}
