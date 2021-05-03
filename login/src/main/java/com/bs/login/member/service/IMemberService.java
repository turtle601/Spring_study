package com.bs.login.member.service;

import com.bs.login.member.Member;

public interface IMemberService {
	void memberRegister(Member member);
	void memberSearch(Member member);
	
	Member[] memberModify(Member member);
	void memberRemove(Member member);
}
