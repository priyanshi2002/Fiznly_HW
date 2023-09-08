package CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import common.hibernateConfig;

import employee.emp;

public class Update {

	public static void main(String[] args) {
		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction(); 
		
	 emp s1 = session.get(emp.class, "1");
	 //System.out.println(s1);
		s1.setName("Ravi");
		
		session.save(s1);
		System.out.println("Data updated successfuly");
		tr.commit();
//	    tr.rollback();
		session.close();
	}
}

