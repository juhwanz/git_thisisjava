package ch20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardDeleteExample {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			// JDBC Driver 등록 (메모리 로드)
			Class.forName("oracle.jdbc.OracleDriver");
			
			//연결하기
			// 커넥션 객체 생성(db 접속 정보)
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe","testuser","test1234");
			System.out.println("연결 성공");	
			
			String sql = new StringBuilder()
					.append("UPDATE boards SET ")
					.append("btitle=?, ")
					.append("bcontent=?, ")
					.append("bfilename=?, ")
					.append("bfiledata=?")
					.append("WHERE bno=?")
					.toString();
			
			//PreparedStatment
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "눈사람");
			pstmt.setString(2, "눈으로 만든 사람");
			pstmt.setString(3, "snowman.jpg");
			pstmt.setBlob(4, BoardDeleteExample.class.getResourceAsStream("snowman.jpg") );
			pstmt.setInt(5, 1);
			
			//Preapred 닫기
			int rows = pstmt.executeUpdate();
			System.out.println("수정된 행 수: " + rows);
			
			pstmt.close();
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					// 연결끊기
					conn.close();
					System.out.println("연결 끊기");
				} catch(SQLException e) {}
			}
		}
	}
}
