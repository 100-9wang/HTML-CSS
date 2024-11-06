 <%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8" isELIgnored="false"  %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>쇼핑몰 판매</title>
	<style>
	@import url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100..900&display=swap');
		body{
			background-color: #fff;
		}
		ul li {
			font-family: 'Noto Serif KR', serif;
			list-style: none;
			margin: 15px 0;
			font-size: 14px;
		}
	</style>
</head>
<% 
	request.setCharacterEncoding("utf-8");
	String user_top = request.getParameter("top");
	String user_pants = request.getParameter("pants");
	String user_shoes = request.getParameter("shoes");
%>
<body>
<form>
	<fieldset id = "subject">
		<legend>쇼핑몰 판매량</legend>
		<ul>
			<li>
				<label>상의</label>
				<meter value=<%= user_top %>></meter>
			</li>
			<li>
				<label>하의</label>
				<meter min="0" max="100" value= <%= user_pants %>></meter>
			</li>
			<li>
				<label>신발</label>
				<meter min="0" max="600" low="0" high="500" value=<%= user_shoes %>></meter>
			</li>
		</ul>
	</fieldset>
</form>
</body>
</html>