package common;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import library.book;

public final class hibernateConfig {
	private hibernateConfig() {

	}

	public static SessionFactory getSessionFactory() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(book.class);
		SessionFactory sf = cfg.buildSessionFactory();

		return sf;

	}
}
