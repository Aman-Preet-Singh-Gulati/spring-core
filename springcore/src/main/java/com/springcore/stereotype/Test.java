/*Spring Bean Scope

1. Singleton: This scopes the bean definition to a single instance per Spring IoC container (default).	
2. Prototype: This scopes a single bean definition to have any number of object instances.
3. Request: This scopes a bean definition to an HTTP request. Only valid in the context of a web-aware Spring ApplicationContext.
4. Session: This scopes a bean definition to an HTTP session. Only valid in the context of a web-aware Spring ApplicationContext.
5. Global-session: This scopes a bean definition to a global HTTP session. Only valid in the context of a web-aware Spring ApplicationContext.*/

package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student student = con.getBean("ob", Student.class);
//		System.out.println(student);
//		System.out.println(student.getAddress());
//		System.out.println(student.getAddress().getClass().getName());
		
//		System.out.println(student.hashCode());
		
		Student student2 = con.getBean("ob",Student.class);
//		System.out.println(student2.hashCode());
		
		Teacher t1 = con.getBean("teacher",Teacher.class);
		Teacher t2 = con.getBean("teacher",Teacher.class);
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}

}
