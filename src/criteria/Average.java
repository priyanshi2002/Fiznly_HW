package criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;

import common.hibernateConfig;
import employee.emp;

public class Average {
	public static void main(String[] args) {

		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(emp.class);
		criteria.setProjection(Projections.avg("salary"));

		List<emp> e = criteria.list();

		System.out.println(e);
	}
}
