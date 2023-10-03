package com.gqt.p1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Student s = (Student) factory.getBean("stud");
		
		s.display();
		Grade grade = s.getGrade();
		System.out.println(grade.getJava_marks());
		System.out.println(grade.getSql_marks());
		System.out.println(grade.getPython_marks());
	}
}
