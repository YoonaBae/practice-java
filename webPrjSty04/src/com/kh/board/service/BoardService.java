package com.kh.board.service;

import java.sql.Connection;
import java.util.List;

import com.kh.board.dao.BoardDao;
import com.kh.board.vo.BoardVo;
import com.kh.common.JDBCTemplate;

public class BoardService{
	
	public List<BoardVo> boardListAll() {
		Connection conn = JDBCTemplate.getConnection();
		
		BoardDao dao = new BoardDao();
		List<BoardVo> list = dao.boardListAll(conn);
		
		JDBCTemplate.close(conn);
		
		return list;
	}

	public int write(BoardVo vo) {
		Connection conn = JDBCTemplate.getConnection();
		
		BoardDao dao = new BoardDao();
		int result = dao.write(conn, vo);
		
		if(result==1) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
	}
}
