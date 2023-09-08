package CRUD;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import common.hibernateConfig;
import employee.emp;

public class load {
	public static void main(String[] args) {

		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		emp e1 = session.load(emp.class, 1);
		System.out.println(e1);
	}
}
