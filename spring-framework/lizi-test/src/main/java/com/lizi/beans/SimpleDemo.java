package com.lizi.beans;

import com.lizi.pojo.Student;
import com.lizi.pojo.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

/**
 * @author lizi
 * @description TODO
 * @date 2022/1/19 15:23
 **/
@EnableScheduling
public class SimpleDemo {
	public static void main(String[] args) {
		testStudentBeans();
	}

	public static void testStudentBeans(){
		//new AnnotationConfigApplicationContext(SimpleDemo.class);
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Student.xml");
	}
}
