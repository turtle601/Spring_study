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
	public void memberRegister(Member member) {
		dao.memberInsert(member);
		
	}
	@Override
	public void memberSearch(Member member) {
		dao.memberSelect(member);
		
	}

	@Override
	public Member[] memberModify(Member member) {
		Member memBef = dao.memberSelect(member);
		Member memAft = dao.memberUpdate(member);
		
		return new Member[]{memBef, memAft};
	}

	@Override
	public void memberRemove(Member member) {
		dao.memberDelete(member);
		
	}


	
}
