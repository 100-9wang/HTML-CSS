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
<%
	request.setCharacterEncoding("utf-8");
	String subject = request.getParameter("subject");
	String[] mailings = request.getParameterValues("mailing");
	
	String mailingsVal = "";
	for(int i = 0; i < mailings.length; i++) {
		if(mailings[i] == null) {
			continue;
		} else {
		 mailingsVal += mailings[i] + "\t";
	 }
	}
%>
<body>
<fieldset>
	<legend>과목</legend>
	<h3>과목명 : <%= subject %></h3>
</fieldset>

<fieldset>
	<legend>뉴스 주제</legend>
	<h3>주제 : <%= mailingsVal %></h3>
</fieldset>
</body>
</html>