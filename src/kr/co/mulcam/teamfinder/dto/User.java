package kr.co.mulcam.teamfinder.dto;

import org.apache.ibatis.type.Alias;

@Alias("User")
public class User {
	
	private int user_index;
	private String user_id;
	private String user_newpwd;	
	private String region;
	private String user_image;
	private String user_stack;
	private String user_email;

	
	
	public User() {
		super();
	}
	public User(int user_index, String user_id, String user_newpwd,
			String region, String user_image, String user_stack, String user_email) {
		super();
		this.user_index = user_index;
		this.user_id = user_id;
		this.user_newpwd = user_newpwd;
		this.region = region;
		this.user_image = user_image;
		this.user_stack = user_stack;
		this.user_email = user_email;
	}
	public int getUser_index() {
		return user_index;
	}
	public void setUser_index(int user_index) {
		this.user_index = user_index;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getUser_image() {
		return user_image;
	}
	public void setUser_image(String user_image) {
		this.user_image = user_image;
	}
	public String getUser_stack() {
		return user_stack;
	}
	public void setUser_stack(String user_stack) {
		this.user_stack = user_stack;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_newpwd() {
		return user_newpwd;
	}
	public void setUser_newpwd(String user_newpwd) {
		this.user_newpwd = user_newpwd;
	}
	@Override
	public String toString() {
		return "User [user_index=" + user_index + ", user_id=" + user_id + ", user_newpwd=" + user_newpwd + ", region="
				+ region + ", user_image=" + user_image + ", user_stack=" + user_stack + ", user_email=" + user_email
				+ "]";
	}

	




}

