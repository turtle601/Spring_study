package com.bs.login.member.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

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
	
	@Resource(name="memService")
	MemberService service;
	
	// 현재 시간을 알려주는 함수(다른 함수가 실행되도 무조건 실행된다.)
	@ModelAttribute("serverTime")
	public String getServerTime(Locale locale){
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		return dateFormat.format(date);
		
	}
	
	
	//입력받은 객체(데이터)를 service클래스의 memberRegister함수를 통해 등록한다. 
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String Join(Member member) {
		
		service.memberRegister(member);
		
		//해당 객체들의 값을 jsp에 보여줄 수 있게 한다. 
		return "joinOk";
		
		
	}
	//입력받은 객체(데이터)를 service클래스의 memberSearch함수를 통해서 해당 데이터가 있는지 찾는다. 
	@RequestMapping(value = "/loginPage", method = RequestMethod.POST)
	public String login(Member member) {
		
		service.memberSearch(member);
		
		return "loginOk";
	}
	
		
	//입력받은 객체(데이터)를 service 클래스의 memberRemove함수를 통해서 해당 데이터를 삭제한다. 
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String remove(@ModelAttribute("mem") Member member) {
		
		service.memberRemove(member);
		
		return "removeOk";
		
		
	}
	
	// 입력받은 객체(데이터)를 service 클래스의 memberModify함수를 통해서 해당 데이터를 수정한다. 
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public ModelAndView modify(Member member) {
		
		Member[] members = service.memberModify(member);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("memBef", members[0]);
		mav.addObject("memAft", members[1]);
		
		// 보여질 뷰 이름
		mav.setViewName("modifyOk");
		
		return mav;
			
	}
	
	
}