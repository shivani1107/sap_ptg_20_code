package com.yash.cmsapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBUtil {
	static {
		try {
			Class c=Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	private  Connection openConnection() {
		Connection con=null;
		
		try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cms","Shivani Pareta","root");
		} 
		catch (SQLException e) {
			e.printStackTrace();

		}
		return con;

	}
	public  PreparedStatement getPreparedStatement(String sql) throws SQLException {
		PreparedStatement pstmt=null;
		try{
			pstmt=openConnection().prepareStatement(sql);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return pstmt;

	}
}
