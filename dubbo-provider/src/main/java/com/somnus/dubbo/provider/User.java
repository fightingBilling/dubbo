package com.somnus.dubbo.provider;

import java.io.Serializable;

/**  
 * @Description: TODO
 * @author Somnus
 * @date 2016年3月18日 下午10:05:56 
 * @version 1.0 
 */
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;
	private String sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
