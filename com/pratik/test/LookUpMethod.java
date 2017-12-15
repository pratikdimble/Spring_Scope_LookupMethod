package com.pratik.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pratik.entity.person;

public class LookUpMethod {

	public static void main(String[] args) {
	//configuring the application  context
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/pratik/cfg/config.xml");
		//get the bean
		person p1=(person)ctx.getBean("per");
				
		//get the bean second time 
		person p2=(person)ctx.getBean("per");
		
		System.out.println("\n\t1.Person-->"+p1.hashCode()+"\t1.Employee-->"+p1.getemp().hashCode());
		System.out.println("\n\t2.Person-->"+p2.hashCode()+"\t2.Employee-->"+p2.getemp().hashCode());
		
		if(p1.hashCode()==p2.hashCode()) {
			System.out.println("\t\tPerson is In Singleton");
			System.out.println("\t\tEmployee is In Prototype");
		}else
			System.out.println("\t\tExit");

	}

}
