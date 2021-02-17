package kr.co.mulcam.teamfinder.controller;

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
	public String index(User user) {
		secessionService.secession(user);
		return "redirect:/index";
	}
	
//	@PostMapping("/memberEdit")
//	public String memberEdit(@ModelAttribute User user) {
//		int result = memberEditService.editMember(user);
//		if(result == 1)
//			return "redirect:/member_edit/member_edit";
//		else
//			return "redirect:/member_edit/member_edit";
//	}
}
