package com.mkki.test;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mkki.domain.BoardVO;
import com.mkki.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class BoardDAOTest {
	private static final Logger logger = LoggerFactory.getLogger(BoardDAOTest.class);

	@Inject
	private BoardDAO dao;
	
	@Test
	public void testRead() throws Exception{
		int bno = 1;
		logger.info(dao.read(bno).toString());
	}
	@Test
	public void testListPage() throws Exception{
		int page = 3;
		List<BoardVO> list = dao.listPage(page);
		for(BoardVO boardVO : list) {
			logger.info(boardVO.getBno() + ":"+boardVO.getTitle());
		}
	}
}
