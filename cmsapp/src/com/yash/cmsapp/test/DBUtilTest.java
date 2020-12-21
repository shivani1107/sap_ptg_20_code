package com.yash.cmsapp.test;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.yash.cmsapp.util.DBUtil;

public class DBUtilTest  {
	public static void main(String args[]) {
		DBUtil dbUtil=new DBUtil();
		String sql="INSERT INTO users (NAME,contact,email,ROLE,loginname,PASSWORD) VALUES('shivani','9866564339','shivanipareta13@gmail.com',1,'shivani pareta','shivani123')";
		
		PreparedStatement pstmt;
		try {
			pstmt = dbUtil.getPreparedStatement(sql);
			pstmt.execute();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	
	

}
