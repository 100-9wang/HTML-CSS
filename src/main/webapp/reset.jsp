<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>insert title here</title>
</head>
<body>
	<fieldset>
	<legend>수강 과목</legend>
	<h3> 영어회화(초급)</h3>
	<h3> 강의 시간 : ${sbjtime} </h3>
	</fieldset>

	<fieldset>
	<legend>신청자</legend>
	<h3> 이름 : ${uname} </h3>
	<h3> 학번 : ${uid} </h3>
	<h3> 학과 : ${uclass} </h3>
	</fieldset>

	<fieldset>
	<legend>교재 주문</legend>
	<h3> 교재 : ${book}</h3>
	<h3> 워크시트 : ${wsheet}</h3>
	<h3> 단체주문 : ${group}</h3>
	</fieldset>
</body>
</html>