package pro.test;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.*;

public class MemberDAO {

	private Connection conn;
	private PreparedStatement pstmt;
	
    public MemberDAO() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            
            conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe",
                    "system",
                    "oracle"
            ); 
			} catch(ClassNotFoundException e) {
				e.printStackTrace();
        } catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
    public boolean overlappedID(String id){
    	
    	boolean result = false;
    	try{
    		String sql = "SELECT DECODE(COUNT(*), 1, 'true','false') as result FROM t_member where id = ?";
    		System.out.println("PrepareStatedment: " + sql);
    		pstmt = conn.prepareStatement(sql);
    		pstmt.setString(1, id);
    		ResultSet rs = pstmt.executeQuery();
            rs.next();
            result = Boolean.parseBoolean(rs.getString("result"));
    	}catch (SQLException e) {
			e.printStackTrace();
		}
    	System.out.println("값 읽음#1" + result);
		return result;
    }
}