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
	
	// ���� �ð��� �˷��ִ� �Լ�(�ٸ� �Լ��� ����ǵ� ������ ����ȴ�.)
	@ModelAttribute("serverTime")
	public String getServerTime(Locale locale){
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		return dateFormat.format(date);
		
	}
	
	
	//�Է¹��� ��ü(������)�� serviceŬ������ memberRegister�Լ��� ���� ����Ѵ�. 
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String Join(Member member) {
		
		service.memberRegister(member);
		
		//�ش� ��ü���� ���� jsp�� ������ �� �ְ� �Ѵ�. 
		return "joinOk";
		
		
	}
	//�Է¹��� ��ü(������)�� serviceŬ������ memberSearch�Լ��� ���ؼ� �ش� �����Ͱ� �ִ��� ã�´�. 
	@RequestMapping(value = "/loginPage", method = RequestMethod.POST)
	public String login(Member member) {
		
		service.memberSearch(member);
		
		return "loginOk";
	}
	
		
	//�Է¹��� ��ü(������)�� service Ŭ������ memberRemove�Լ��� ���ؼ� �ش� �����͸� �����Ѵ�. 
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String remove(@ModelAttribute("mem") Member member) {
		
		service.memberRemove(member);
		
		return "removeOk";
		
		
	}
	
	// �Է¹��� ��ü(������)�� service Ŭ������ memberModify�Լ��� ���ؼ� �ش� �����͸� �����Ѵ�. 
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public ModelAndView modify(Member member) {
		
		Member[] members = service.memberModify(member);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("memBef", members[0]);
		mav.addObject("memAft", members[1]);
		
		// ������ �� �̸�
		mav.setViewName("modifyOk");
		
		return mav;
			
	}
	
	
}