package com.bs.login.member.service;

import com.bs.login.member.Member;

public interface IMemberService {
	void memberRegister(String id, String pw, String mail, String hp1, String hp2, String hp3);
	Member memberSearch(String id, String pw);
	
	void memberModify();
	void memberRemove();
}
