<%@page import="com.kh.member.vo.MemberVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	MemberVo loginMember = (MemberVo)session.getAttribute("loginMember");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>나 혼자 레이어 나누기~</h1>
	<hr>
	<%if(loginMember != null){ %>
	
		<h2><%=loginMember.getNick() %>님 안녕하세요~*^^*</h2>
		<a href="/appSty04/board/list">게시판</a>
		<br><br><br>
		<hr>
		<a href="/appSty04/member/logout">로그아웃</a>
	
	<%} else{%>
	
	<a href="/appSty04/member/join">회원가입</a>
	<br>
	<a href="/appSty04/member/login">로그인</a>
	
	<%} %>
</body>
</html>