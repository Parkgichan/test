<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>Yongin LMS</h1>
<form action="loginServlet" method="post">
	I      D : <input type="text" name="id" /><br>
	Password : <input type="password" name="pwd" /><br>
				<input type="radio" name=ra value="Professor"/>Professor
				<input type="radio" name=ra value="Student"/> Student<br>
				<input type="submit" value="Login" />
	</form>
</body>
</html>