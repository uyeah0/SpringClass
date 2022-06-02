package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	// get방식으로 /test로 접속했을 때 콘솔에 test출력
	public String test() {
		System.out.println("test");
		return "index";
	}
}
