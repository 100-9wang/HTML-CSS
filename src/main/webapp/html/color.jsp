<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"
 isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>insert title here</title>
	<style>
		<% 	
			request.setCharacterEncoding("utf-8");
			String color = request.getParameter("color");
		%>	
div{
background-color: ${color};
}
	</style>
</head>
<body>
	<div>
		<fieldset>
			<legend>색상 정보</legend>
			<h3> 선택한 색상 : <%= color %> </h3>
		</fieldset>
	</div>

</body>
</html>