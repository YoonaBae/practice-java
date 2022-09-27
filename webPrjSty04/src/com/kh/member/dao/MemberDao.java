package com.kh.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.kh.common.JDBCTemplate;
import com.kh.member.vo.MemberVo;

public class MemberDao {
	
	public int memberJoin(Connection conn, MemberVo vo) {
		
		String sql = "INSERT INTO MEMBER (MEMBER_ID, MEMBER_PWD, MEMBER_NICK) VALUES (?,?,?)";
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPwd());
			pstmt.setString(3, vo.getNick());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		return result;
	}

	public MemberVo memberLogin(Connection conn, MemberVo vo) {
		
		String sql = "SELECT MEMBER_ID, MEMBER_PWD, MEMBER_NICK FROM MEMBER WHERE MEMBER_ID = ? AND MEMBER_PWD = ?";	
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberVo loginMember = null;
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPwd());
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String dataId = rs.getString("MEMBER_ID");
				String dataPwd = rs.getString("MEMBER_PWD");
				String dataNick = rs.getString("MEMBER_NICK");
				
				loginMember = new MemberVo();
				loginMember.setId(dataId);
				loginMember.setPwd(dataPwd);
				loginMember.setNick(dataNick);
			}
						
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rs);
			JDBCTemplate.close(pstmt);
		}
		
		return loginMember;
	}
	
}
