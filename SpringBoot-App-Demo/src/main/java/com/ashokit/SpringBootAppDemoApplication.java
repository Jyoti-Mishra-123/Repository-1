package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.student.Student;

@SpringBootApplication
public class SpringBootAppDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootAppDemoApplication.class, args);
		Student st=new Student();
		st.setId(101);
		st.setName("jyoti");
		st.setAge(25);
		st.setAddrs("bbsr");
		System.out.println(st);
	}

}
