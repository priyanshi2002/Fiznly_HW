package criterias;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import common.hibernateConfig;
import library.book;

public class Title {
	SessionFactory sf = hibernateConfig.getSessionFactory();
	Session session = sf.openSession();
	Criteria criteria = session.createCriteria(book.class);
	criteria.add(Restrictions.like("title","jav%"));
	List<book> list = criteria.list();
	for(book emp:list)
	{
		System.out.println(emp);
	}
}
}
