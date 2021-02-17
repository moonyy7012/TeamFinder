package kr.co.mulcam.teamfinder.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.mulcam.teamfinder.dto.User;
import kr.co.mulcam.teamfinder.service.SecessionService;

@Controller
public class SecessionController {
	@Autowired
	private SecessionService secessionService;
	
	@GetMapping("/secession")
	public String secession(User user) {
		
		return "secession";
	}
	@GetMapping("/index")
	public String secession() {
		return "index";
	}


	
	@PostMapping("/indexForm")
	public String index(HttpSession session, User user) {
		user.setUser_id((String)session.getAttribute("id"));
		
		secessionService.secession(user);
		
		return "redirect:/index";
	}
	
}
