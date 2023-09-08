package crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import common.hibernateConfig;
import library.book;



public class Insert {

	  public static void main(String[] args) {
		
		  
		  SessionFactory sf = hibernateConfig.getSessionFactory();
			Session session = sf.openSession();
			Transaction tr = session.beginTransaction();
			book e = new book();
			e.setTitle("Mahabharat");
			e.setAuthor("Jaya kishori");
			e.setPublication_year("2000");
			e.setISBN("678-905-123");
			 session.save(e);
			 tr.commit();
			System.out.println("Data done");
			
		  
		  
	}
	}

