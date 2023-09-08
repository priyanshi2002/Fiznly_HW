package crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import coomon.hibernateConfig;
import employee.Employee;

public class Delete {
	public static void main(String[] args) {
		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction(); 
		
	 Employee s1 = session.get(Employee.class, 1);

	    
		session.delete(s1);
		System.out.println("Data deleted");
		tr.commit();
		session.close();
}
}
