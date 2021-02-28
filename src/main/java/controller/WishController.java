package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import service.WishService;

@Controller
public class WishController {
	@Autowired
	WishService service;
	@RequestMapping(method=RequestMethod.GET, value="/wish")
	public String wish(Model model3) {
		model3.addAttribute("wmsg", service.getResult());
		return "result";
	}
	@RequestMapping(method=RequestMethod.GET, value="/welcome")
	public String load() {
		System.out.println("welcome page loaded 5");
		return "welcome";
	}
}
