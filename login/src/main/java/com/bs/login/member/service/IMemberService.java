package com.bs.login.member.service;

import com.bs.login.member.Member;

public interface IMemberService {
	void memberRegister(Member member);
	Member memberSearch(Member member);
	
	Member memberModify(Member member);
	int memberRemove(Member member);
}
