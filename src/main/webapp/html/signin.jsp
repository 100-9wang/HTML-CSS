<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title></title>
</head>
<body>
	<fieldset>
			<legend>회원 정보</legend>
			<h3> 아이디 : ${new_id} </h3>
			<h3> 비밀번호 1: ${new_pw1} </h3>
			<h3> 비밀번호 2: ${new_pw2} </h3>
			<h3> 이름 : ${user_name} </h3>
			<h3> 이메일 : ${user_email} </h3>
			<h3> 전화번호 : ${user_tel} </h3>
	</fieldset>
</body>
</html>