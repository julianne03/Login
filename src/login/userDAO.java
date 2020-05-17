package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class userDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public userDAO() {
		try {
			String dbURL="jdbc:mysql://localhost:3306/user";
			String dbID="root";
			String dbPassword="123456";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL,dbID,dbPassword);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public int login(String userID,String userPassword) {
		String SQL="select userPassword from user where userID= ?";
		String dbpasswd="";
		try {
			pstmt=conn.prepareStatement(SQL);
			pstmt.setString(1, userID);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				dbpasswd =rs.getString("userPassword");
				if(dbpasswd.equals(userPassword)) {
					return 1;
				}
				else {
					return 0;
				}
			}
			return -1;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return -2;
	}
	
	public int join(String userID,String userPassword,String gender,int age) {
		String SQL="insert into user values (?,?,?,?)";
		try {
			pstmt=conn.prepareStatement(SQL);
			pstmt.setString(1, userID);
			pstmt.setString(2, userPassword);
			pstmt.setString(3, gender);
			pstmt.setInt(4, age);
			return pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public int update(String userID,String userPassword,String gender,int age) {
		String SQL="update user set userPassword=?,gender=?,age=? where userID=?";
		
		try {
			pstmt=conn.prepareStatement(SQL);
			pstmt.setString(1,userPassword);
			pstmt.setString(2,gender);
			pstmt.setInt(3,age);
			pstmt.setString(4,userID);
			
			return pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public int delete(String userID) {
		String SQL="delete from user where userID=?";
		
		try {
			pstmt=conn.prepareStatement(SQL);
			pstmt.setString(1, userID);
			
			return pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	
}
