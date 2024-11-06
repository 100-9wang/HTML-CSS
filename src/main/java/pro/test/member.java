package pro.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;

public class member {
	public int selectMember(String id, String pw) {
		Connection conn = null;
		int result = 0;

		try{
			Class.forName("oracle.jdbc.OracleDriver");

            conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe",
                    "system",
                    "oracle"
            );

            String sql = "select * from member1 where id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next() == true) {
            	String pwd = rs.getString("user_pw");
            	if (pwd.equals(pw)) {
            			result = 0;
            	} else {
            			result = 1;
            	}
              }
              conn.close();

		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}