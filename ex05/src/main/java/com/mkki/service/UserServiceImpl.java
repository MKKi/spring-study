package com.mkki.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mkki.domain.UserVO;
import com.mkki.dto.LoginDTO;
import com.mkki.persistence.UserDAO;

@Service
public class UserServiceImpl implements UserService{
	@Inject
	private UserDAO dao;
	
	@Override
	public UserVO login(LoginDTO dto) throws Exception {
		return dao.login(dto);
	}
}
