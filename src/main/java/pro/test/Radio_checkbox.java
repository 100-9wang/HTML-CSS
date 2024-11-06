package pro.test;

import java.io.IOException;
import java.util.Iterator;
import java.lang.Override;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Radio_checkbox")
public class Radio_checkbox extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 생성");
	}

	public void destroy() {
		System.out.println("destroy 실행");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String subject = request.getParameter("subject");
		String mailings[] = request.getParameterValues("mailing");
		System.out.println(subject + "\t");
	for(int i = 0; i < mailings.length; i++) {
		if(mailings[i] == null) {
			continue;
		} else {
		 System.out.println(mailings[i] + "\t");
	 }
	}
	request.setAttribute("subject", subject);
	request.setAttribute("mailing", mailings);
	RequestDispatcher dispatch = request.getRequestDispatcher("radio_checkbox.jsp");
	dispatch.forward(request, response);
	
	}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
	}

}
