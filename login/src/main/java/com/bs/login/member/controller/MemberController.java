package com.bs.login.member.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bs.login.member.Member;
import com.bs.login.member.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController{
	
	@Resource(name="memService")
	MemberService service;
	
	// method의 기본값은 GET
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(Member member) {
//		String Id = request.getParameter("id");
//		String Pw = request.getParameter("pw");
//		String Mail = request.getParameter("mail");
//		String HP1 = request.getParameter("hp1");
//		String HP2 = request.getParameter("hp2");
//		String HP3 = request.getParameter("hp3");
//		
		service.memberRegister(member.getId(), member.getPw(), member.getMail(), member.getHp1(), member.getHp2(), member.getHp3());
		
		return "joinOk";
	}
	
	@RequestMapping(value = "/loginPage", method = RequestMethod.POST)
	public String login(Model model, @RequestParam("id") String id,
			@RequestParam("pw") String pw) {
//		String Id = request.getParameter("id");
//		String Pw = request.getParameter("pw");
//		
		Member member = service.memberSearch(id,pw);
		
		try {
			model.addAttribute("memId", member.getId());
			model.addAttribute("memPw", member.getPw());
			
		} catch(Exception e) {
			e.printStackTrace();
			
		}
		
		return "loginOk";
		
		
	}
	
}