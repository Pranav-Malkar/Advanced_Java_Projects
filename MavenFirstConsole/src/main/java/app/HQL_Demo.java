package app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import entities.Emp;

public class HQL_Demo {
	public static void main(String[] args) {
		
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
						

		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
						
	
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();
				
		
		Session session = sf.openSession();
		
	
		/*Query q = session.createQuery("from Emp");
		
		List<Emp> emps = q.getResultList();
		
		for(Emp e : emps)
			System.out.println(e.getEmpid()+" : "+e.getEname()+" : "+e.getSalary());
			*/
		
		
		/*Query<Object[]> q = session.createQuery("select empid,ename from Emp where deptno = 30", Object[].class);
		
		List<Object[]> emps = q.getResultList();
		
		for(Object[] emp : emps)
			System.out.println(emp[0]+ " : "+emp[1]);
			*/
		
		Query q= session.createNamedQuery("getBySal");
		q.setParameter("min", 10000.0f);
		q.setParameter("max", 70000.0f);
		
		List<Object[]> emps = q.getResultList();
		
		for(Object[] emp : emps)
			System.out.println(emp[0]+ " : "+emp[1]);
		
		
	}
		

}
