package criterias;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import common.hibernateConfig;
import library.book;

public class Authors {
	public static void main(String[] args) {
		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();

		System.out.println("Books written by a specific author");

		Criteria criteria = session.createCriteria(book.class);
		criteria.add(Restrictions.like("author", "abs"));
		List<book> l = criteria.list();
		for (book b : l) {
			System.out.println(b);
		}
	}
}
