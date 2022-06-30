package kr.hs.study.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {
	
	@GetMapping("/menu")
	public String menu() {
		return "menu";
	}
	
	@GetMapping("/sum")
	public String sum(Model model) {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		model.addAttribute("sum", sum);
		return "sum";
	}

	@GetMapping("/multi_table")
	public String multi_table() {
		return "multi_table";
	}
	
	@PostMapping("/multi_table_print")
	public String multi_table(HttpServletRequest httpServletRequest, Model model) {
		int number = Integer.parseInt(httpServletRequest.getParameter("number"));
		System.out.println(number);
		
		String result = "";
		for(int i = 1; i <= 10; i++) {
			System.out.print( number + " x " + i + " = " + number*i + "\n");
			result += Integer.toString(number) + " x " + Integer.toString(i) + " = " + number*i + "\n";
		}
		
		model.addAttribute("result", result);
		
		return "multi_table_print";
	}
}
