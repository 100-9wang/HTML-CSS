package pro.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ajaxTest02")
public class AjaxTest2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doHandle(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doHandle(request, response);
	}
	
	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		String result = "";
		PrintWriter writer = response.getWriter();
		result = 
			//xml 코드
			//![CDATA[ 문자열 ]] -> 에러나지 않게 도와주는 특수코드	
						"<main><book>"+
						 "<title><![CDATA[초보자를 위한 자바 프로그래밍]]></title>" +
						 "<writer><![CDATA[인포북스 저자 이병승]]></writer>" +                             
						"<image><![CDATA[http://localhost:8090/inputoutput/images/3.jpg]]></image>"+
						 "</book>"+
						 "<book>"+
						 "<title><![CDATA[모두의 파이썬]]></title>" +
						 "<writer><![CDATA[길벗 저자 이승찬]]></writer>" +                 
						"<image><![CDATA[http://localhost:8090/inputoutput/images/4.png]]></image>"+
						 "</book></main>";
		System.out.println(result);
		writer.print(result);
	}
}