package kr.co.mulcam.teamfinder.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.mulcam.teamfinder.dto.User;
import kr.co.mulcam.teamfinder.service.MemberEditService;

@Controller
public class MemberEditController {
	@Autowired
	private MemberEditService memberEditService;
	
	@GetMapping("/memberEdit")
	public String memberEditForm(HttpSession session) {
		session.setAttribute("id", "mom");
		
		return "member_edit";
	}

	@PostMapping("/member_edit")
	public String member_edit (HttpSession session, User user) {
		String userId = (String)session.getAttribute("id");
		user.setUser_id((String)session.getAttribute("id"));
		// uSER의 아이디를 통해 유저 정보를 조회한다.
		User com = memberEditService.findUserbyId(userId);
		if(user.getUser_newpwd().equals("")) {
			user.setUser_newpwd(com.getUser_newpwd());
		}
		if(user.getUser_email().equals("")) {
			user.setUser_email(com.getUser_email());
		}
		
		if(user.getRegion().equals("")) {
			user.setRegion(com.getRegion());
		}
		if(user.getUser_image().equals("")) {
			user.setUser_image(com.getUser_image());
		}
		if(user.getUser_stack().equals("")) {
			user.setUser_stack(com.getUser_stack());
		}
		if(user.getUser_email().equals("")) {
			user.setUser_email(com.getUser_email());
		}
		
		
		memberEditService.editMember(user);
		return "redirect:/memberEdit";
	}
	
}
