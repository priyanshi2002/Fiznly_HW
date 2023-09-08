package criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import coomon.hibernateConfig;
import employee.Employee;

public class Testing {

		public static void main(String[] args) {

			SessionFactory sf = hibernateConfig.getSessionFactory();
			Session session = sf.openSession();
			Criteria criteria = session.createCriteria(Employee.class);
			criteria.add(Restrictions.ne("department", "tester"));
			List<Employee> list = criteria.list();
			for (Employee emp : list) {
				System.out.println(emp);
			}
		}

	}

