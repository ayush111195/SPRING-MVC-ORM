package springmvcwithorm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvcwithorm.model.User;
import springmvcwithorm.service.UserService;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	private UserService userService;
	
@RequestMapping("/home")
	public String home()
	{
		return "index";
		
	}
@RequestMapping(path = "processform", method = RequestMethod.POST)
public String formHandel(@ModelAttribute User user1 ,Model m) {
	System.out.println(user1);
	m.addAttribute("User",user1);
	if(user1.getUserName().isBlank()) {
		return"redirect:/home";
	}

 int userid=this.userService.creatUser(user1);
 m.addAttribute("msg","user created with'id'="+userid);
	return "success";
	
}
}
