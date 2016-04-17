package com.somnus.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**  
 * @Description: TODO
 * @author Somnus
 * @date 2016年3月18日 下午10:19:29 
 * @version 1.0 
 */
public class Provider {
	
	public static void main(String[] args) throws Exception {  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        		new String[] {"spring-dubbo-provider.xml"});  
        
        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟  
    }  
}
