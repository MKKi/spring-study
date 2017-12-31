package com.mkki.persistence;

import com.mkki.domain.UserVO;
import com.mkki.dto.LoginDTO;

public interface UserDAO {
	public UserVO login(LoginDTO dto) throws Exception;
}
