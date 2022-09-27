<%@page import="com.kh.board.vo.BoardVo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	List<BoardVo> list = (List)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>게시판</h1>
	<table border="1">
		<tr>
			<th>제목</th>
			<th>내용</th>
		</tr>
		
		<%for(int i = 0; i < list.size(); i++) {%>
			<tr>
				<td><%=list.get(i).getTitle() %></td>
				<td><%=list.get(i).getContnet() %></td>
			</tr>
		<%} %>
	</table>
	<hr>
	<a href="/appSty04/board/write">글 작성하기</a>
</body>
</html>