package com.kh.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.board.service.BoardService;
import com.kh.board.vo.BoardVo;
@WebServlet(urlPatterns = "/board/write")
public class BoardWriteServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/board/write.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		
		BoardVo vo = new BoardVo(title, content);
		
		BoardService bs = new BoardService();
		int result = bs.write(vo);
		
		if(result == 1) {
			resp.sendRedirect("/appSty04/board/list");
		} else {
			req.setAttribute("errorMsg", "게시글 작성 실패~");
			req.getRequestDispatcher("/views/common/errorPage.jsp").forward(req, resp);
		}
	}
}
