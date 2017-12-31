package com.mkki.service;

import com.mkki.domain.UserVO;
import com.mkki.dto.LoginDTO;

public interface UserService {
	public UserVO login(LoginDTO dto) throws Exception;
}
