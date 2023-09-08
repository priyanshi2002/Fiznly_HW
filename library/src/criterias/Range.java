package criterias;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import common.hibernateConfig;
import library.book;

public class Range {
	public static void main(String[] args) {
		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();

		Criteria criteria = session.createCriteria(book.class);
		criteria.add(Restrictions.between("publication_year", "2000", "678-905-123"));
		List<book> l = criteria.list();
		for (book e : l) {
			System.out.println(e);
		}
		System.out.println(" Books published within a certain range of years...");
	}
}
