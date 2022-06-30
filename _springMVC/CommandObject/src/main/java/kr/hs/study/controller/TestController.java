package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.dto.DataBean;

@Controller
public class TestController {

	
//	@PostMapping("/test1")
//	public String test1(DataBean bean, Model model) { // 사용자가 입력한 값이 bean으로 자동주입 @ModelAttribute생략 @ModelAttribute DataBean bean 
//		
//		return "re_test1";
//	}
	
	
//	@PostMapping("/test1")
//	public String test1( @ModelAttribute("data") DataBean bean, Model model) {  // dataBean이 data로 바뀜
//		return "re_test1";
//	}
	
	@PostMapping("/test1")
	public String test1(DataBean bean, Model model) {
		model.addAttribute("dto", bean); // dataBean이 dto로 바뀜
		return "re_test1";
	}
}
