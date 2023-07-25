package app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import entities.*;

public class SaveApp {
public static void main(String[] args) {
		
		
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
				
		
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
				
		
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();
		
		
		Session session = sf.openSession();
		
		
		Emp e = new Emp(234, "Nikhil",70000.0f,30 );
		

		Transaction tr =session.beginTransaction();
		
		
		session.save(e);
		
		
		tr.commit();
				
		session.close();
		
		sf.close();
		
		
		
		
		
		
	}

}
