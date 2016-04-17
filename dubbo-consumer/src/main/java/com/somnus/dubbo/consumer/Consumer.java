package com.somnus.dubbo.consumer;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.somnus.dubbo.provider.DemoService;
import com.somnus.dubbo.provider.User;


/**  
 * @Description: TODO
 * @author Somnus
 * @date 2016年3月18日 下午10:30:06 
 * @version 1.0 
 */
public class Consumer {
	public static void main(String[] args) throws Exception {  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
                new String[] { "spring-dubbo-consumer.xml" }); 
  
        DemoService demoService = (DemoService) context.getBean("demoService");
        String hello = demoService.sayHello("tom"); 
        System.out.println(hello);   
  
        List<User> list = demoService.getUsers();  
        if (list != null && list.size() > 0) {  
            for (int i = 0; i < list.size(); i++) {  
                System.out.println(list.get(i));  
            }  
        }  
        System.in.read();  
    }  
}
