package criterias;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import common.hibernateConfig;
import library.book;

public class Isbn {

	public static void main(String[] args) {
		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(book.class);
		criteria.add(Restrictions.like("ISBN", "123-567-890"));
		List<book> l = criteria.list();
		for (book b : l) {
			System.out.println(b);
		}
	}
}
