package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.model.Product;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Product product =  (Product) context.getBean("product");

		StandardWorkflow s = (StandardWorkflow) context.getBean("standardWorkflow");

		System.out.println("----- Workflow Started -----" + "\n");
		System.out.println("Input - " + product + "\n");

		s.processWorkflow("action1_action", product);

		System.out.println("\n" + " ----- Workflow Ended -----");
	}
}
