package kr.co.mulcam.teamfinder.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.mulcam.teamfinder.dto.User;

//db에 넣고 가져올 수 있는 함수 선언

@Mapper
public interface UsersMapper {
	public int editMember(User user);
	public int secession(User user);
	public User findUserbyId(String id);
}
