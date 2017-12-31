package com.mkki.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.mkki.domain.UserVO;
import com.mkki.dto.LoginDTO;

@Repository
public class UserDAOImpl implements UserDAO{
	@Inject
	private SqlSession session;
	
	
	private static String namespace = "com.mkki.domain.BoardVO";
	
	@Override
	public UserVO login(LoginDTO dto) throws Exception {
		return session.selectOne(namespace+".login", dto);
	}
}