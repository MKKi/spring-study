package com.mkki.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mkki.domain.MessageVO;
import com.mkki.persistence.MessageDAO;
import com.mkki.persistence.PointDAO;

@Service
class MessageServiceImpl implements MessageService{

	@Inject
	private MessageDAO messageDAO;
	
	@Inject
	private PointDAO pointDAO;
	
	@Transactional
	@Override
	public void addMessage(MessageVO vo) throws Exception {
		messageDAO.create(vo);
		pointDAO.updatePoint(vo.getSender(), 10);
	}

	@Override
	public MessageVO readMessage(String userid, Integer mno) throws Exception {
		messageDAO.updateState(mno);
		pointDAO.updatePoint(userid, 5);
		return messageDAO.readMessage(mno);
	}

}
