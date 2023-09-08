package CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import common.hibernateConfig;
import employee.emp;

public class Delete {
	public static void main(String[] args) {
		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction(); 
		
	 emp s1 = session.get(emp.class, "1");

	    
		session.delete(s1);
		System.out.println("Data deleted");
		tr.commit();
		session.close();
}
}
