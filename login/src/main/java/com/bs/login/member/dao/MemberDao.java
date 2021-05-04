package com.bs.login.member.dao;


import java.util.HashMap;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.bs.login.member.dao.IMemberDao;
import com.bs.login.member.Member;

@Repository
public class MemberDao implements IMemberDao {

	private HashMap<String, Member> dbMap;
	
	public MemberDao() {
		dbMap = new HashMap<String, Member>();
	}
	
	@Override
	public Map<String, Member> memberInsert(Member member) {
		
		dbMap.put(member.getId(), member);
		return dbMap;
		
	}

	@Override
	public Member memberSelect(Member member) {
		
		Member mem = dbMap.get(member.getId());
		
		return mem;
		
	}

	@Override
	public Member memberUpdate(Member member) {
		
		dbMap.put(member.getId(), member);
		return dbMap.get(member.getId());
		
	}

	@Override
	public Map<String, Member> memberDelete(Member member) {
		
		dbMap.remove(member.getId());
		return dbMap;
		
	}
	
}
