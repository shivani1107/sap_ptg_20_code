package com.yash.cmsapp.domain;

public class User extends Person {
private int status;
private int role;
private String loginname;
private String password;
private int userid;
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
public int getRole() {
	return role;
}
public void setRole(int role) {
	this.role = role;
}
public String getLoginname() {
	return loginname;
}
public void setLoginname(String loginname) {
	this.loginname = loginname;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
