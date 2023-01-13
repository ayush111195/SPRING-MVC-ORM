package springmvcwithorm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	
//	@RequestMapping("/one")
//	public String one() {
//		System.out.println("this is ayush one");
//		return "redirect:/two";
//		
//	}
//	
//	@RequestMapping("/two")
//public String two() {
//	System.out.println("this is arpit one");
//	return "index";
//	
//}
	@RequestMapping("/one")
	public RedirectView one() {
		System.out.println("this is ayush one");	
		RedirectView redirectView=new RedirectView(); // redirectview ka object bna liya 
		redirectView.setUrl("two");
		return redirectView;
		
	}
	@RequestMapping("/two")
	public String two() {
	System.out.println("this is arpit one");
		return "index";
	
	}
}
