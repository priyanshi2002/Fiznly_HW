package crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import library.book;
import common.hibernateConfig;


public class load {
	public static void main(String[] args) {

		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		book e1 = session.load(book.class,1);
		System.out.println(e1);
	}
}
