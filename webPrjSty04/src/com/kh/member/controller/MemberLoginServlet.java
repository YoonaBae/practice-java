package com.kh.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.member.service.MemberService;
import com.kh.member.vo.MemberVo;
@WebServlet(urlPatterns = "/member/login")
public class MemberLoginServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/member/login.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String memberId = req.getParameter("memberId");
		String memberPwd = req.getParameter("memberPwd");
		
		MemberVo vo = new MemberVo();
		vo.setId(memberId);
		vo.setPwd(memberPwd);
		
		MemberService ms = new MemberService();
		MemberVo loginMember = ms.memberLogin(vo);
		
		if(loginMember != null) {
			HttpSession session = req.getSession();
			session.setAttribute("loginMember", loginMember);
			resp.sendRedirect("/appSty04");
		
		} else {
			req.setAttribute("errorMsg", "로그인 실패");
			req.getRequestDispatcher("/views/common/errorPage.jsp").forward(req, resp);
		}
	}
}
