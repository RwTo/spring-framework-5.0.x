package com.rwto.beans.context.xml;

/**
 * @author renmw
 * @create 2023/9/12 17:50
 **/
public class SimpleBean {

	private String userName;
	private String password;
	private String desc;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "SimpleBean{" +
				"userName='" + userName + '\'' +
				", password='" + password + '\'' +
				", desc='" + desc + '\'' +
				'}';
	}
}
