package kr.co.mulcam.teamfinder.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.mulcam.teamfinder.domain.CommentVO;

@Repository("kr.co.mulcam.teamfinder.domain.commentVO")
public interface CommentMapper {
	public int commentCount() throws Exception;
	public List<CommentVO> commentList() throws Exception;
	public int commentInsert(CommentVO comment) throws Exception;
	public int commentUpdate(CommentVO comment) throws Exception;
	public int commentDelete(int comment_order) throws Exception;
	
}
