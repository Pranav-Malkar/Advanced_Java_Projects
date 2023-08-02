package apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import entities.*;

public class CompositionFetch {

	public static void main(String[] args) {
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
	
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
						
		
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();	

		Session session = sf.openSession();
		//Transaction tr=session.beginTransaction();
		
		Student st=session.get(Student.class, 1);
		System.out.println(st.getName()+" : "+st.getAddress().getCity());

		session.close();
		//tr.commit();
		
		sf.close();

	}

}
