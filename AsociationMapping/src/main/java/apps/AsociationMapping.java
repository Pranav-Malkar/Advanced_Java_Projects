package apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import entities.*;


public class AsociationMapping {

	public static void main(String[] args) {
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		

		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
						
	
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();	

		Session session = sf.openSession();	
//		Category c1= new Category("Stationary","Stationary items");
//		
//		Transaction tr =session.beginTransaction();
//		
//		session.save(c1);
//		
//    	tr.commit();
		Product p1 = new Product("Pen", 5, session.get(Category.class, 1));
		
		Transaction tr =session.beginTransaction();
		
		session.save(p1);
		
		tr.commit();	

	}

}
