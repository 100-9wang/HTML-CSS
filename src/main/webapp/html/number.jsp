 <%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"
 isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
	<title>insert title here</title>
</head>
<%
		request.setCharacterEncoding("utf-8");
		String number1 = request.getParameter("number1");
		String number2 = request.getParameter("number2");
		String range = request.getParameter("range");
		String command = request.getParameter("command");
%>	
<body>
	<fieldset>
		<legend>등록 정보</legend>
		<h3> <b>참여인원 : <%= number1 %></b> </h3>
		<h3> <b>지원물품 : <%= number2 %></b> </h3>
		<h3> <b>희망단계 : <%= range %></b> </h3>
		<h3> <b> 추신 : <%= command %></b> </h3>
	</fieldset>
</body>
</html>