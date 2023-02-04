package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main (String [] args) {
		
        // Creating the class path XML application context object for configuring the configuration file in main class.
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/ref_config.xml");
        
        A temp = (A) context.getBean("aref");
        System.out.println(temp.getX());
        System.out.println(temp.getOb().getY());
        System.out.println();
        System.out.println(temp);
	}
}
