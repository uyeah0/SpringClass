package kr.hs.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.model.DataBean;
import kr.hs.study.service.serviceInterface;


@Controller
public class TestController {
	@Autowired
	private  serviceInterface service1;
	
	@GetMapping("/input_data")
	public String input() {
		return "input";
	}
	
	@PostMapping("/re_input")
	public String re_input(DataBean bean) {
		service1.insert(bean);
		return "result";
	}
	
	
	@GetMapping("/read_data")
	public String read_data(Model model){
		List<DataBean> list = service1.select();
		model.addAttribute("list", list);
		return "result2";
	}
	
	@GetMapping("/update_data")
	public String update_data_form(){
	return "update_data_form";
	}
	
	@PostMapping("/re_update")
	public String re_update(DataBean bean){
		service1.update(bean);
		return "result";
	}

}




