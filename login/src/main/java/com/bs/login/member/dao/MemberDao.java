package com.bs.login.member.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bs.login.member.Member;

@Component
public class MemberDao implements IMemberDao{
	
	private HashMap<String, Member> dbMap;
	
	public MemberDao() {
		dbMap = new HashMap<String,Member>();
		
	}

	@Override
	public void memberInsert(String id, String pw, String mail, String hp1, String hp2, String hp3) {
		System.out.println("memberInsert()");
		System.out.println("id: " + id);
		System.out.println("pw: " + pw);
		System.out.println("mail: " + mail);
		System.out.println("Phone: " + hp1 + " - " + hp2 + " - " + hp3);
		
		Member member = new Member();
		
		member.setId(id);
		member.setPw(pw);
		member.setMail(mail);
		member.setHp1(hp1);
		member.setHp2(hp2);
		member.setHp3(hp3);
		
		dbMap.put(id,member);
		
		Set<String> keys = dbMap.keySet();
		Iterator<String> iterator = keys.iterator();
		
		while (iterator.hasNext()) {
			String key = iterator.next();
			Member mem = dbMap.get(key);
			System.out.print("memberid:" + mem.getId() + "\t");
			System.out.print("|memberpw:" + mem.getPw() + "\t");
			System.out.print("|membermail:" + mem.getMail() + "\t");
			System.out.print("|memberPhone:" + mem.getHp1() + " - " + 
											   mem.getHp2() + " - " + 
											   mem.getHp3() + "\n");
		}
	}	
		
	@Override
	public Member memberSelect(String id, String pw) {
		Member member = dbMap.get(id);
		return member;
	}

	@Override
	public void memberUpdate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void memberDelete() {
		// TODO Auto-generated method stub
		
	}
	
}
