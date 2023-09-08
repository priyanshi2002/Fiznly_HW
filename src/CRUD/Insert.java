package CRUD;

import employee.emp;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import common.hibernateConfig;


public class Insert {
  public static void main(String[] args) {
	
	  
	  SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		emp e = new emp();
		e.setId("5");
		e.setName("Harshita");
		e.setSalary("40000");
		e.setDepartment("hr");
		 session.save(e);
		 tr.commit();
		System.out.println("Data done");
		
	  
	  
}
}
