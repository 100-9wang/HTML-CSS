package pro.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SigninDB")
public class Signin extends HttpServlet {

	private Connection conn = null;
    

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init DB 연결");
		 try {
	         Class.forName("oracle.jdbc.OracleDriver");

	         conn = DriverManager.getConnection(
	                 "jdbc:oracle:thin:@localhost:1521:xe",
	                 "system",
	                 "oracle"
	         );
	         System.out.println("연결 성공");
	     } catch (ClassNotFoundException e) {
	         System.out.println("클래스 못찾음");
	         e.printStackTrace();
	     } catch (SQLException e) {
	         System.out.println("SQL Exception 발생");
	         e.printStackTrace();
	     }
	}

	
	public void destroy() {
		System.out.println("destroy 실행");
		 if (conn != null) {
             try {
                 conn.close();
                 System.out.println("연결 끊기");
             } catch (SQLException e) {}
         }
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		/* 로그인 */
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		request.setAttribute("user_id", user_id);
		request.setAttribute("user_pw", user_pw);
		try {
			System.out.println("try");
			String sql1 = "SELECT * FROM USER_ WHERE NEW_ID=? AND NEW_PW1=?";
			PreparedStatement pstmt = conn.prepareStatement(sql1);
			pstmt.setString(1, user_id);
			pstmt.setString(2, user_pw);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next() == false) {
				System.out.println("아이디 또는 비밀번호를 잘못입력하셨습니다.");
				return;
				} else {
					String result1 = rs.getString("new_id");
					String result2 = rs.getString("new_pw1");
					if (result1.equals(user_id) && result2.equals(user_pw)) {
						System.out.println("로그인 성공");
					} else {
						System.out.println("실패");
						return;
					}
				}
					
			rs.close();
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
		RequestDispatcher dispatch = request.getRequestDispatcher("login2.jsp");
		dispatch.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		/* 회원가입 */
		String new_id = request.getParameter("new_id");
		String new_pw1 = request.getParameter("new_pw1");
		String new_pw2 = request.getParameter("new_pw2");
		String user_name = request.getParameter("user_name");
		String user_email = request.getParameter("user_email");
		String user_tel = request.getParameter("user_tel");
		
		request.setAttribute("new_id", new_id);
		request.setAttribute("new_pw1", new_pw1);
		request.setAttribute("new_pw2", new_pw2);
		request.setAttribute("user_name", user_name);
		request.setAttribute("user_email", user_email);
		request.setAttribute("user_tel", user_tel);
		
		try {
            String sql = "INSERT INTO user_ (new_id, new_pw1, new_pw2, user_name, user_email, user_tel) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, new_id);
            pstmt.setString(2, new_pw1);
            pstmt.setString(3, new_pw2);
            pstmt.setString(4, user_name);
            pstmt.setString(5, user_email);
            pstmt.setString(6, user_tel);
            pstmt.executeUpdate();
            pstmt.close();
            System.out.println("회원가입이 성공적으로 처리되었습니다.");
        } catch (Exception e) {
            e.printStackTrace();
        }
   
		RequestDispatcher dispatch = request.getRequestDispatcher("signin.jsp");
		dispatch.forward(request, response);
	}

}
