package com.kh.member.controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.common.JDBCTemplate;
import com.kh.member.service.MemberService;
import com.kh.member.vo.MemberVo;
@WebServlet(urlPatterns = "/member/join")
public class MemberJoinServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/member/join.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		
		String memberId = req.getParameter("memberId");
		String memberPwd = req.getParameter("memberPwd");
		String memberNick = req.getParameter("memberNick");
		
		MemberVo vo = new MemberVo(memberId, memberPwd, memberNick);
		
		MemberService ms = new MemberService();
		int result = ms.memberJoin(vo);
		
		if(result == 1) {
			resp.sendRedirect("/appSty04");
		} else {
			req.setAttribute("errorMsg", "회원가입 실패");
			req.getRequestDispatcher("/views/common/errorPage.jsp").forward(req, resp);
		}
		
	}
}
