package com.bs.login.member.dao;

import com.bs.login.member.Member;

public interface IMemberDao {
	void memberInsert(String id, String pw, String mail, String hp1, String hp2, String hp3);
	Member memberSelect(String id, String pw);
	void memberUpdate();
	void memberDelete();
}
