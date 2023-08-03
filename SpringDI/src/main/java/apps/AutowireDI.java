package apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Emp;

public class AutowireDI {

	public static void main(String[] args) {
		ApplicationContext at=new ClassPathXmlApplicationContext("autowireContext.xml");
		Emp e = (Emp)at.getBean("emp");  
		
		System.out.println(e.toString());

	}

}
