package apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import beans.*;

public class DIApps {

	public static void main(String[] args) {
		ApplicationContext at=new ClassPathXmlApplicationContext("appContext.xml");
		Emp e = (Emp)at.getBean("emp");  
		
		System.out.println(e.toString());  

		

	}

}
