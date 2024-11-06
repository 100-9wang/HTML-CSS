package pro.test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Meter")
public class Meter extends HttpServlet {
	
    
   

	
	public void init(ServletConfig config) throws ServletException {
	System.out.println("init 생성");
	}

	public void destroy() {
		System.out.println("destroy 실행");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user_top = request.getParameter("top");
		String user_pants = request.getParameter("pants");
		String user_shoes = request.getParameter("shoes");
		System.out.println(user_top);
		
		request.setAttribute("top", user_top);
		request.setAttribute("pants", user_pants);
		request.setAttribute("shoes", user_shoes);
		RequestDispatcher dispatch = request.getRequestDispatcher("meter.jsp");
		dispatch.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
