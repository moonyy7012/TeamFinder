package kr.co.mulcam.teamfinder.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.mulcam.teamfinder.domain.CommentVO;
import kr.co.mulcam.teamfinder.service.CommentService;

@Controller
@RequestMapping("/comment")
public class CommentController {
	@Resource(name="kr.co.mulcam.teamfinder.service.CommentService")
	CommentService mCommentService;
	
	@RequestMapping("/list")
	@ResponseBody
	private List<CommentVO> mCommentServiceList(Model model) throws Exception{
		return mCommentService.commentListService();
	}
}
