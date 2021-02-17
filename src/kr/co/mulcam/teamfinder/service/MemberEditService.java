package kr.co.mulcam.teamfinder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.mulcam.teamfinder.dao.UsersMapper;
import kr.co.mulcam.teamfinder.dto.User;


//이 파일에서 UsersMapper 객체 이용해 db에 데이터 넣고 빼는 동작 수행
@Service
public class MemberEditService {
	@Autowired
	private UsersMapper userMapper;
	
	
	
	@Transactional(readOnly = false)
	public int editMember(User user) throws RuntimeException{
		int returnValue = 0;
		
		
		try {
			
			returnValue =  userMapper.editMember(user);
		} catch (Exception e) {
			
			e.printStackTrace();
			returnValue =  0;
		}
		
		
		return returnValue;
	}
	
	@Transactional(readOnly = false)
	public User findUserbyId(String id) throws RuntimeException{
		User result;
		try {
			result = userMapper.findUserbyId(id);
		} catch (Exception e) {
			result = null;
		}
		return result;
	}

}
