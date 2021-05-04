package com.bs.login.member.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bs.login.member.Member;
import com.bs.login.member.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController{
	
	@Autowired
	MemberService service;
	
	// "/cp" = index.jsp
	@ModelAttribute("cp")
	public String getContextPath(HttpServletRequest request) {
		return request.getContextPath();
	}
	
	// 현재 시간을 알려주는 함수(다른 함수가 실행되도 무조건 실행된다.)
	@ModelAttribute("serverTime")
	public String getServerTime(Locale locale){
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		return dateFormat.format(date);
		
	}
	
	
	//join
	@RequestMapping("/joinForm")
	public String joinFrom(Member member) {
		return "/member/joinForm";
		
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String joinReg(Member member) {
		service.memberRegister(member);
		
		return "/member/joinOk";	
		
	}
	
	// Login
	@RequestMapping("/loginForm")
	public String loginFrom(Member member) {
		return "/member/loginForm";
		
	}
	
	// submit login button
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(Member member,HttpSession session) {
		
		Member mem = service.memberSearch(member);
		
		session.setAttribute("member", mem);
		
		return "/member/loginOk";
		
	}
	
	// logout 링크
	@RequestMapping("/logout")
	public String logout(Member member,HttpSession session) {
		session.invalidate();
		
		return "/member/logoutOk";
		
	}
	
	// Modify
	@RequestMapping(value = "/modifyForm", method = RequestMethod.GET)
	public ModelAndView modifyForm(HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		Member member = (Member) session.getAttribute("member");
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("member",service.memberSearch(member));
	
		mav.setViewName("/member/modifyForm");
		return mav;
		
	}
	
	// submit modify button
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public ModelAndView modify(Member member, HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		
		Member mem = service.memberModify(member);
		session.setAttribute("member", mem);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("memAft", mem);
		mav.setViewName("/member/modifyOk");
		
		return mav;
	}
	
	// Rename
	@RequestMapping("/removeForm")
	public ModelAndView removeForm(HttpServletRequest request) {
		
		ModelAndView mav = new ModelAndView();
		
		HttpSession session =  request.getSession();
		Member member = (Member) session.getAttribute("member");
		mav.addObject("member", member);
		mav.setViewName("/member/removeForm");
		
		return mav;
	
	}
	
	// submit remove button
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String remove(Member member, HttpServletRequest request) {
		
		service.memberRemove(member);
		
		HttpSession session = request.getSession();
		session.invalidate();
		
		return "/member/removeOk";
	}

	
	
}