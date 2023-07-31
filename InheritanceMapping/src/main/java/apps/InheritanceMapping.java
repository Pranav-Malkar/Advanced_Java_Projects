package apps;

import org.hibernate.Session;
import entities.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class InheritanceMapping {

	public static void main(String[] args) {
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		

		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
								
	
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();	

		Session session = sf.openSession();
				
		Emp e1 = new PermanentEmp("Pranav","XXX","1234",100,2000,3000,400);
		Emp e2 = new TemporaryEmp("nikhil","yyy","5678",400,5000,800);
		Emp e3 = new TemporaryEmp("sam","yyy","5678",400,5000,800);
		
		Emp e = new Emp("p","ss","13",100.0f);
		
		Emp e4 = new TemporaryEmp("pranv","yyy","5678",400,5000,800);

				
		Transaction tr =session.beginTransaction();
		
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e);
		session.save(e4);
		
		tr.commit();
		
		System.out.println("Emps saved");

		session.close();
				
		sf.close();	

	}

}
