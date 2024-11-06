package pro.test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Rstime")
public class Rstime extends HttpServlet {
  
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 생성");
	}

	
	public void destroy() {
		System.out.println("destroy 실행");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String start1 = request.getParameter("start1");
		String start2 = request.getParameter("start2");
		String end1 = request.getParameter("end1");
		String end2 = request.getParameter("end2");
		
		System.out.println(start1);
		System.out.println(end1);
		System.out.println(start2);
		System.out.println(end2);
		
		request.setAttribute("start1", start1);
		request.setAttribute("end1", end1);
		request.setAttribute("start2", start2);
		request.setAttribute("end2", end2);
		RequestDispatcher dispatch = request.getRequestDispatcher("rstime.jsp");
		dispatch.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
