<%@ page language="java" contentType="text/html;
charset=UTF-8" pageEncoding="UTF-8"
isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	String user_id = request.getParameter("user_id");
	String pwd1 = request.getParameter("pwd1");
	String pwd2 = request.getParameter("pwd2");

	String user_name = request.getParameter("user_name");
	String mail = request.getParameter("mail");
	String phone = request.getParameter("phone");
	String homep = request.getParameter("homep");
%>

<fieldset>
	<legend>로그인 정보</legend>
	<h3>아이디 : <%= user_id %></h3>
	<h3>비밀번호 :<%= pwd1 %></h3>
	<h3>비밀번호 : <%= pwd2 %></h3>
</fieldset>

<fieldset>
	<legend>개인 정보</legend>
	<h3>이름 : <%= user_name %></h3>
	<h3>메일 주소 : <%= mail %></h3>
	<h3>연락처 : <%= phone %></h3>
	<h3>블로그/홈페이지 : <%= homep %></h3>
</fieldset>
</body>
</html>