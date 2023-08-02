package apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import entities.*;

public class CompositionSave {
	public static void main(String[] args) {
		
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
				

		SessionFactory sf = metadata.getSessionFactoryBuilder().build();	

		Session session = sf.openSession();
		
		Address add = new Address("Gavbhag","Ichalkaranji","416115");
		Student st = new Student("Pranav",add);
		
		Transaction tr= session.beginTransaction();
		session.save(st);
		tr.commit();
		
		System.out.println("Student saved");
		
		session.close();
		sf.close();

		
		
		
	}

}
