package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// Creating the class path XML application context object for configuring the configuration file in main class.
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/configci.xml");
        
		/*
		 * Person person1 = (Person) context.getBean("person");
		 * System.out.println(person1);
		 */
        
        Person person = (Person) context.getBean("person");
        System.out.println(person);
        
        Addition add = (Addition) context.getBean("add");
        add.doSum();
	}

}
