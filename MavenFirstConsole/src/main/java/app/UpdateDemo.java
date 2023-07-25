package app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import entities.*;

public class UpdateDemo {

	public static void main(String[] args) {
	
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
						
	
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();
				
	
		Session session = sf.openSession();
		
		Emp e = session.get(Emp.class, 1);
		
		if(e != null)
		{
			e.setSalary(60000.0f);
			Transaction tr = session.beginTransaction();
			session.update(e);
			tr.commit();
			System.out.println("Emp updated");			
		}
		
		session.close();
		sf.close();


	}

}
