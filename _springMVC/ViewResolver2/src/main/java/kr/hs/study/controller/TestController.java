package kr.hs.study.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@GetMapping("/test1")
	public String test1() {
		return "test1";
	}
	
	@GetMapping("/test2")
	public String test2(HttpServletRequest request) {
		request.setAttribute("data3", 1);
		request.setAttribute("data4", 2);
		return "test2";
	}
	
	@GetMapping("/test3")
	// �����͸� Model�� ���� ���� <-- request ������ �����Ѵ�!!!!!!!!!
	public String test3(Model model) {
		model.addAttribute("data5", 500);
		model.addAttribute("data6", 600);
		return "test3";
	}
	
	@GetMapping("/test4")
	// �����͸� Model�� ���� ���� <-- request ������ �����Ѵ�!!!!!!!!!
	public ModelAndView test4(ModelAndView mv) {
		// -----Model�� ������
		mv.setViewName("test4");
		// -----------------
		mv.addObject("data7", 700);
		mv.addObject("data8", 800);
		return mv;
	}
}
