package crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import common.hibernateConfig;
import library.book;

public class Delete {
	public static void main(String[] args) {
		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction(); 
		
	 book s1 = session.get(book.class, "123-456-567");

	    
		session.delete(s1);
		System.out.println("Data deleted");
		tr.commit();
		session.close();
}
}
