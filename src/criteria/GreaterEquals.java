package criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import common.hibernateConfig;
import employee.emp;

public class GreaterEquals {
public static void main(String[] args) {
	SessionFactory sf = hibernateConfig.getSessionFactory();
	Session session = sf.openSession();
	Criteria criteria = session.createCriteria(emp.class);
	criteria.add(Restrictions.ge("salary", "20000"));
	List<emp> list = criteria.list();
	for (emp employee : list) {
		System.out.println(employee);
	}
}
}
