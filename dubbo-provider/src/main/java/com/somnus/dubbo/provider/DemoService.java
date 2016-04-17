package com.somnus.dubbo.provider;

import java.util.List;

/**  
 * @Description: TODO
 * @author Somnus
 * @date 2016年3月18日 下午10:04:22 
 * @version 1.0 
 */
public interface DemoService {
	String sayHello(String name);
	  
    public List<User> getUsers();
}
