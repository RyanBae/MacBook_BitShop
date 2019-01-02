<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    
    String accountNum = "";
	Random random = new Random();
	for(int i=0; i<5; i++){
		if(i==2){
			accountNum += random.nextInt(10)+"-";
		} else {
			accountNum += random.nextInt(10);
		}
	}
    
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>계좌 생성 완료</h1>
	<h3>계좌번호 : <%=accountNum %></h3>
	<h3><a href="">계좌관리</a></h3>
	<h3><a href="../index.jsp">홈으로</a></h3>
	
</body>
</html>