package com.mkki.service;

import com.mkki.domain.MessageVO;

public interface MessageService {
	public void addMessage(MessageVO vo) throws Exception;
	
	public MessageVO readMessage(String userid, Integer mno) throws Exception;
}
