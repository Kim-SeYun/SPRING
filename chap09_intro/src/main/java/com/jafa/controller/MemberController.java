package com.jafa.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
	
	@RequestMapping(value = "member/list", method = RequestMethod.GET)
	public String list() {
		// registry("WEB-INF/views/",".jsp")
		// WEB-INF/views/board/boardList.jsp
		
		return "member/list"; // View 이름
	}
	
	@RequestMapping("/member/register")
	public String registerForm() {
		return "member/register";
	}
	
	@RequestMapping(value = "/member/register", method = RequestMethod.POST)
	public String register(String userId, String userPwd) {
		System.out.println(userId);
		System.out.println(userPwd);
		System.out.println("register메서드 실행");
		return "redirect:/";
	}
	
	@GetMapping("/member/detail")
	public String detail(Long mno) {
		System.out.println(mno);
		return "member/detail";
	}

}
