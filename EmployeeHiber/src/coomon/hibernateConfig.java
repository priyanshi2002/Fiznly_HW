package coomon;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import employee.Employee;


public final class hibernateConfig {
	private hibernateConfig() {

	}

	public static SessionFactory getSessionFactory() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();

		return sf;

	}
}