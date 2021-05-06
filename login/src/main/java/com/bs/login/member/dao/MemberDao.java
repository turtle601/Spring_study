package com.bs.login.member.dao;


import java.beans.PropertyVetoException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bs.login.member.dao.IMemberDao;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.bs.login.member.Member;

@Repository
public class MemberDao implements IMemberDao {

	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:turtle601";
	private String userid = "system";
	private String userpw = "1234";
	
	private ComboPooledDataSource dataSource;
	
	private JdbcTemplate template;
	
	public MemberDao() {
		dataSource = new ComboPooledDataSource();
		try {
			dataSource.setDriverClass(driver);
			dataSource.setJdbcUrl(url);
			dataSource.setUser(userid);
			dataSource.setPassword(userpw);
			
		} catch(PropertyVetoException e){
			e.printStackTrace();
			
		}
		
		template = new JdbcTemplate();
		template.setDataSource(dataSource);
	}
	
	@Override
	public int memberInsert(Member member) {
		int result = 0;
		
		final String sql = "INSERT INTO member (memId, memPw, memMail) values (?,?,?)";
		result = template.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1,member.getId());
				pstmt.setString(2, member.getPw());
				pstmt.setString(3, member.getMail());
				
			}
			
		});

		return result;
	}
	@Override
	public Member memberSelect(Member member) {
		
		List<Member> members = null;
		
		final String sql = "SELECT * FROM member WHERE memId = ? AND memPw = ?";
		
		members = template.query(sql, new Object[]{member.getId(), member.getPw()}, new RowMapper<Member>() {

			@Override
			public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
				Member mem = new Member();
				mem.setId(rs.getString("memId"));
				mem.setPw(rs.getString("memPw"));
				mem.setMail(rs.getString("memMail"));
				mem.setPurcNum(rs.getInt("memPurcNum"));
				return mem;
			}
			
		});
		
		if(members.isEmpty()) 
			return null;
		
		return members.get(0);
	}
	@Override
	public int memberUpdate(Member member) {
		int result = 0;
		
		final String sql = "UPDATE member SET memPw = ?, memMail = ? WHERE memId = ?";
		
		result = template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, member.getPw());
				pstmt.setString(2, member.getMail());
				pstmt.setString(3, member.getId());
			}
		});
		return result;
	
	}
	@Override
	public int memberDelete(Member member) {

		int result = 0;
		
		final String sql = "DELETE member WHERE memId = ? AND memPw = ?";
		
		result = template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, member.getId());
				pstmt.setString(2, member.getPw());
			}
		});
		
		return result;
	
	}
	
}