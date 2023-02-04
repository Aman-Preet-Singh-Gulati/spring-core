package com.springcore.collections;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String args []) {

        // Creating the class path XML application context object for configuring the configuration file in main class.
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collection_config.xml");
        
        Employees emp1 = (Employees) context.getBean("emp1");
        System.out.println(emp1);
        System.out.println(emp1.getName());
        System.out.println(emp1.getAddresses());
        System.out.println(emp1.getCourses());
        System.out.println(emp1.getPhones());
        
	}
}
