package pro.test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Reset")
public class Reset extends HttpServlet {
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 생성");
	}
	
	public void destroy() {
		System.out.println("destroy 실행");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		/* 프리셋 #1 */
		String sbjtime = request.getParameter("sbjtime");
		request.setAttribute("sbjtime", sbjtime);
		
		/* 프리셋 #2 */
		String uname = request.getParameter("uname");
		String uid = request.getParameter("uid");
		String uclass= request.getParameter("uclass");
		request.setAttribute("uname", uname);
		request.setAttribute("uid", uid);
		request.setAttribute("uclass", uclass);
		
		/* 프리셋 #3 */
		String book = request.getParameter("book");
		String wsheet = request.getParameter("wsheet");
		String group = request.getParameter("group");
		request.setAttribute("book", book);
		request.setAttribute("wsheet", wsheet);
		request.setAttribute("group", group);
	
		RequestDispatcher dispatch = request.getRequestDispatcher("reset.jsp");
		dispatch.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
