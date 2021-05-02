package com.bs.login.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bs.login.member.Member;
import com.bs.login.member.dao.MemberDao;

@Repository("memService")
public class MemberService implements IMemberService{
	
	@Autowired
	MemberDao dao;
	
	@Override
	public void memberRegister(String id, String pw, String mail, String hp1, String hp2, String hp3) {
		// TODO Auto-generated method stub
		System.out.println("memberRegister()");
		System.out.println("id: " + id);
		System.out.println("pw: " + pw);
		System.out.println("mail: " + mail);
		System.out.println("Phone: " + hp1 + " - " + hp2 + " - " + hp3);
		
		dao.memberInsert(id,pw,mail,hp1,hp2,hp3);
	}

	@Override
	public Member memberSearch(String id, String pw) {
		System.out.println("memberSearch()");
		System.out.println("id: " + id);
		System.out.println("pw: " + pw);
		
		Member member = dao.memberSelect(id,pw);
		
		return member;
	}

	@Override
	public void memberModify() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void memberRemove() {
		// TODO Auto-generated method stub
		
	}
	
}
