package criteria;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import common.hibernateConfig;
import employee.emp;

public class Queries {
	public static void main(String[] args) {

		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();

		Query query = session.createQuery("from emp");
		List<emp> e = query.list();
		
		for (emp employee : e) {
			System.out.println(employee);
		}
	}
}
