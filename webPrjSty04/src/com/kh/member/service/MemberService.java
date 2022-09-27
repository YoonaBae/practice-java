package com.kh.member.service;

import java.sql.Connection;

import com.kh.common.JDBCTemplate;
import com.kh.member.dao.MemberDao;
import com.kh.member.vo.MemberVo;

public class MemberService {
	
	public int memberJoin(MemberVo vo) {
		Connection conn = JDBCTemplate.getConnection();
		
		MemberDao dao = new MemberDao();
		
		int result = dao.memberJoin(conn, vo);
		
		if(result == 1) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
	}

	public MemberVo memberLogin(MemberVo vo) {
		
		Connection conn = JDBCTemplate.getConnection();
		
		MemberDao dao = new MemberDao();
		MemberVo loginMember = dao.memberLogin(conn, vo);
		
		JDBCTemplate.close(conn);
		
		return loginMember;
	}
	
}
