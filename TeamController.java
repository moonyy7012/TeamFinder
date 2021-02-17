package kr.co.mulcam.teamfinder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.mulcam.teamfinder.dto.User;
import kr.co.mulcam.teamfinder.service.TeamService;

@Controller
public class TeamController {
	@Autowired
	private TeamService teamService;
	
	@GetMapping("/team")
	public String team(User user) {
		return "team";
	}

//	@PostMapping("/member_edit")
//	public String member_edit(User user) {
//		memberEditService.editMember(user);
//		return "redirect:/memberEdit";
//	}
	
//	@PostMapping("/memberEdit")
//	public String memberEdit(@ModelAttribute User user) {
//		int result = memberEditService.editMember(user);
//		if(result == 1)
//			return "redirect:/member_edit/member_edit";
//		else
//			return "redirect:/member_edit/member_edit";
//	}
}
