
<%@page import="domain.AccountBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../home/head.jsp"%>
<body>
	<%
		System.out.println(" => open-result 입장");
	%>
	<table id="wrapper">
		<tr>
			<td colspan="2"><%@ include file="../home/header.jsp"%>
			</td>
		</tr>
		<tr>
			<td colspan="2"><%@ include file="../account/navi-bar.jsp"%>

			</td>
		</tr>
		<tr style="height: 300px">
			<td style="width: 30%"><%@ include
					file="../account/side-menu.jsp"%></td>

			<td colspan="2">

				<div>
					<%
					AccountBean acc = (AccountBean)request.getAttribute("acc");
					String accountNum = acc.getAccountNum();
					String date = acc.getToday();
					String money = String.valueOf(acc.getMoney());
					
					
					/*
						String date = request.getAttribute("date").toString();
						System.out.println(date);
						String money = request.getAttribute("money").toString();
						System.out.println(money);
						String accountNum = request.getAttribute("num").toString();
						System.out.println(accountNum);
						*/
					%>
					<b>계좌가 개설되었습니다.</b><br /> <br /> 날짜 :
					<%=date%> <br />
					계좌번호 :
					<%=accountNum%>
					<br /> 잔액 :
					<%=money%><br />
				</div>
			</td>

		</tr>
	</table>
</body>
</html>

