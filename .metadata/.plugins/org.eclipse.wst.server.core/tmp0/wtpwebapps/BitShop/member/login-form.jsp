<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인</h1>
	<form action="login-result.jsp">
	<h3>ID : <input type="text" name="id"/></h3>
	<h3>pass : <input type="text" name="pass"/></h3>
	<h3>name : <input type="text" name="name"/></h3>
	<input type="submit" id=btn value="login" /><br />
	</form>
	<br />
	<a href="join-form.jsp">회원가입</a><br />
	<a href="../index.jsp">홈으로</a>
</body>
</html>