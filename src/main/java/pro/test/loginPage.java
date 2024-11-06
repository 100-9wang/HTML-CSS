package pro.test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginPage")
public class loginPage extends HttpServlet {
       
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 생성");
	}

	public void destroy() {
		System.out.println("destroy 메소드 호출");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String user_id = request.getParameter("user_id");
		String pwd1 = request.getParameter("pwd1");
		String pwd2 = request.getParameter("pwd2");
		request.setAttribute("user_id : ", user_id);
		request.setAttribute("user_pw : ", pwd1);
		
		String user_name = request.getParameter("user_name");
		String mail = request.getParameter("mail");
		String phone = request.getParameter("phone");
		String homep = request.getParameter("homep");
		
		request.setAttribute("user_id", user_id);
		request.setAttribute("pwd1", pwd1);
		request.setAttribute("pwd2", pwd2);
		request.setAttribute("user_name", user_name);
		request.setAttribute("mail", mail);
		request.setAttribute("phone", phone);
		request.setAttribute("homep", homep);
		
		RequestDispatcher dispatch =
				request.getRequestDispatcher("loginPage.jsp");
		dispatch.forward(request, response);
	}

}
