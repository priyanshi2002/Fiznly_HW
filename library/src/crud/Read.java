package crud;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import common.hibernateConfig;
import library.book;


public class Read {
	public static void main(String[] args) {
		SessionFactory sf=hibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(book.class);
		List<book>list = criteria.list();
		for(book e:list)
		{
			System.out.println(e);
		}
	}
}
