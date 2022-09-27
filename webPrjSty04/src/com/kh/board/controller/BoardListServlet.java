package com.kh.board.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.board.service.BoardService;
import com.kh.board.vo.BoardVo;
@WebServlet(urlPatterns = "/board/list")
public class BoardListServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		BoardService bs = new BoardService();
		List<BoardVo> list = bs.boardListAll();
		
		// 화면
		if(list != null) {
			req.setAttribute("list", list);
			req.getRequestDispatcher("/views/board/list.jsp").forward(req, resp);
		} else {
			req.setAttribute("errorMsg", "게시판 조회 실패");
			req.getRequestDispatcher("/views/common/errorPage.jsp").forward(req, resp);
		}
		
	}
}
