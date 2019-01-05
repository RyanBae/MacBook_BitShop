package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;

/**
 * Servlet implementation class MemberController
 */
@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("==> 맴버 서블릿으로 입장");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		System.out.println("ID ="+id);
		System.out.println("PASS ="+pass);
		
		if(id.equals("test")&&pass.equals("test")){
			Command.move(request, response, "home/main");
			System.out.println("참이다!!!");
		}else {
			Command.move(request, response, "index");
			System.out.println("else 로 왔다!!");
		}
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
