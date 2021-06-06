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

<form action="subject.do" method="post">
	I   D : <input type="text" name="id" /> 교과목번호<br>
	TITLE : <input type="text" name="title" /> 강의명<br>
	# of Student : <input type="text" name="stu" /> 학생수<br>
				<input type="submit" value="Enroll" />
</body>
</html>