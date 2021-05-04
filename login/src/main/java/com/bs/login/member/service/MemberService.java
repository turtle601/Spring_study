package com.bs.login.member.service;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.bs.login.member.Member;
import com.bs.login.member.dao.MemberDao;

@Service
public class MemberService implements IMemberService{
	
	@Autowired
	MemberDao dao;
	
	
	@Override
	public void memberRegister(Member member) {
		printMembers(dao.memberInsert(member));
		
	}
	@Override
	public Member memberSearch(Member member) {
		Member mem = dao.memberSelect(member);
		printMember(mem);
		return mem;
	}

	@Override
	public Member memberModify(Member member) {
		
		Member memAft = dao.memberUpdate(member);
		printMember(memAft);
		return memAft;
	}

	@Override
	public void memberRemove(Member member) {
		printMembers(dao.memberDelete(member));
		
	}

	private void printMembers(Map<String, Member> map) {
		
		Set<String> keys = map.keySet();
		Iterator<String> iterator = keys.iterator();
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			Member mem = map.get(key);
			printMember(mem);
			
		}
	}
	
	private void printMember(Member mem) {
		
		System.out.print("ID:" + mem.getId() + "\t");
		System.out.print("|PW:" + mem.getPw() + "\t");
		System.out.print("|MAIL:" + mem.getMail() + "\n");
		
	}
	
	
}
