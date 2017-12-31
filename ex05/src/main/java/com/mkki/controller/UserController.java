package com.mkki.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mkki.domain.UserVO;
import com.mkki.dto.LoginDTO;
import com.mkki.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Inject
	private UserService service;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public void loginGET(@ModelAttribute("dto") LoginDTO dto) {
		
	}
	
	@RequestMapping(value="/loginPost", method=RequestMethod.POST)
	public void loginPost(LoginDTO dto, HttpSession session, Model model) throws Exception{
		UserVO vo = service.login(dto);
		if(vo == null) {
			return;
		}
		
		model.addAttribute("userVO", vo);
	}
}
