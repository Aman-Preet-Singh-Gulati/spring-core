package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
/*
 * Above annotation will let the IOC container know that this java class is the
 * configuration class
 */
public class JavaConfig {

	@Bean
	/* Above annotation will let the IOC container know that this is Bean */
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	@Bean(name = {"student","temp2","con"})
	/* From the Bean annotation we can give one or multiple names to it */
	public Student getStudent() {
		// creating a new student object
		Student student = new Student(getSamosa());
		return student;
	}
}
