package crud;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import coomon.hibernateConfig;
import employee.Employee;

public class load {
	public static void main(String[] args) {

		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Employee e1 = session.load(Employee.class, 1);
		System.out.println(e1);
	}
}
