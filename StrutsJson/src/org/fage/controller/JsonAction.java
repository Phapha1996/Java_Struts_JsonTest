package org.fage.controller;

import java.util.Date;

import net.sf.json.JSONObject;

import org.fage.domain.User;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 
 * From:http://www.cnblogs.com/jway1101/p/5833890.html
 * @author Administrator
 *
 */
public class JsonAction extends ActionSupport {
	private User user;
	private String json;
	
	public String getJson() {
		return json;
	}
	public void setJson(String json) {
		this.json = json;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String execute() throws Exception{
		User user = new User();
		user.setId(1);
		user.setName("fage");
		user.setBirthday(new Date());
		JSONObject jsonObj = JSONObject.fromObject(user);
		json = jsonObj.toString();
		System.out.println(json);
		return "success";
	}
}
