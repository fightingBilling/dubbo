package com.somnus.dubbo.provider;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @author Somnus
 * @date 2016年3月18日 下午10:05:13
 * @version 1.0
 */
public class DemoServiceImpl implements DemoService {

	public String sayHello(String name) {
		return "Hello " + name;
	}

	public List<User> getUsers() {
		List<User> list = new ArrayList<User>();
		User u1 = new User();
		u1.setName("jack");
		u1.setAge(20);
		u1.setSex("男");

		User u2 = new User();
		u2.setName("tom");
		u2.setAge(21);
		u2.setSex("女");

		User u3 = new User();
		u3.setName("rose");
		u3.setAge(19);
		u3.setSex("女");

		list.add(u1);
		list.add(u2);
		list.add(u3);
		return list;
	}
}
