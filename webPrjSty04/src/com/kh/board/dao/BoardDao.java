package com.kh.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kh.board.vo.BoardVo;
import com.kh.common.JDBCTemplate;

public class BoardDao {

	public List<BoardVo> boardListAll(Connection conn) {
		
		String sql = "SELECT TITLE, CONTENT FROM BOARD";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<BoardVo> list = new ArrayList<>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String dataTitle = rs.getString("TITLE");
				String dataContent = rs.getString("CONTENT");
				
				BoardVo vo = new BoardVo(dataTitle, dataContent);
				
				list.add(vo);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rs);
			JDBCTemplate.close(pstmt);
		}
		return list;
		
	}

	public int write(Connection conn, BoardVo vo) {
		String sql = "INSERT INTO BOARD(TITLE, CONTENT) VALUES (?,?)";
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContnet());
			
			result = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	}
	
}
