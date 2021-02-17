package kr.co.mulcam.teamfinder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.mulcam.teamfinder.dao.UsersMapper;
import kr.co.mulcam.teamfinder.dto.User;


//이 파일에서 UsersMapper 객체 이용해 db에 데이터 넣고 빼는 동작 수행
@Service
public class SecessionService {
	@Autowired
	private UsersMapper userMapper;
	
	
	
	@Transactional(readOnly = false)
	public int secession(User user) throws RuntimeException{
		
		int returnValue = 0;
		
		
		try {
			returnValue =  userMapper.secession(user);
		} catch (Exception e) {
			e.printStackTrace();
			returnValue =  0;
		}
		
		
		return returnValue;
	}

}
