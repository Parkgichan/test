<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>Subject</h1>
	<form action="studentMenu.do" method="post">
		ID : <input type="text" name="id"> 교과목 번호 입력/조회
		<input type="hidden" name="job" value="search">
		<input type="submit" value="Search">
		
	<%@ include file="homeMenu.jsp"%>
</body>
</html>