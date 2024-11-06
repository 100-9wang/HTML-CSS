<%@ page language="java" contentType="text/html;
charset=UTF-8" pageEncoding="UTF-8"
isELIgnored="false" %>
<!DOCTYPE html>
<html lang = "ko">
<head>
<meta charset="UTF-8">
<title>로그인 하기</title>
<style>
ul{
	list-style: none;
}
li{
	margin: 10px;
}
il label{
	width: 120px;
	float: left;
	text-align: center;
	padding-right: 8px;
}
input[type="submit"]{
	text-align: center;
	width:100%;
	height: 30px;
	margin-top: 15px;
}

</style>
</head>
<body>
<%
	
%>

<h1>로그인</h1>
<form method="post" action="loginPage" enctype="UTF-8">
<fieldset>
	<legend>로그인 정보</legend>
	<ul>
		<li>
		<label for="user_id">아이디 : </label>
			<input type="text" name="user_id">
		</li>
		<li>
			<label for="pwd1">비밀번호 : </label>
			<input type="password" name="pwd1">
		</li>
		<li>
			<label for="pwd2">비밀번호 확인 : </label>
			<input type="password" name="pwd2">
		</li>
	</ul>
</fieldset>
<input type="submit" value="로그인">
</form>
</body>
</html>