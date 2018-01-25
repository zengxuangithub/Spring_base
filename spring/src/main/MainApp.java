package main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		 HelloWorld helloWorld=(HelloWorld) context.getBean("helloWorld");
	helloWorld.getMessage();
	
	}

}
