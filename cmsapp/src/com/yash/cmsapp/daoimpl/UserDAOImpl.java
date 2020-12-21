package com.yash.cmsapp.daoimpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.yash.cmsapp.dao.UserDAO;
import com.yash.cmsapp.domain.User;
import com.yash.cmsapp.util.DBUtil;

public class UserDAOImpl extends DBUtil implements UserDAO {

	@Override
	public void save(User user) {
String sql="INSERT INTO users (NAME,contact,email,ROLE,loginname,PASSWORD) VALUES(?,?,?,?,?,?)";
try {
	PreparedStatement pstmt=getPreparedStatement(sql);
	pstmt.setString(1, user.getName());
	pstmt.setString(2, user.getContact());
	pstmt.setString(3,user.getEmail());
	pstmt.setInt(4, user.getRole());
	pstmt.setString(5, user.getLoginname());
	pstmt.setString(6, user.getPassword());
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
