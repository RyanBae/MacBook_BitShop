package command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pool.Constant;

public class Command {
	public static void move(HttpServletRequest request, HttpServletResponse response, String path) throws ServletException, IOException {
		System.out.println("===>커맨더 입장 ");
		String dispatcher = "";
		if(path.equals("index")) {
			dispatcher = "/index" + Constant.JSP;
		}else {
			dispatcher = Constant.VIEW + path + Constant.JSP;
		}
		request.getRequestDispatcher(dispatcher).
			forward(request, response);		
	}
}
