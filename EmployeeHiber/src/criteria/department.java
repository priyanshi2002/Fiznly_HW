package criteria;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

import coomon.hibernateConfig;
import employee.Employee;
public class department {

		public static void main(String[] args) {

			SessionFactory sf = hibernateConfig.getSessionFactory();
			Session session = sf.openSession();
			
			Criteria criteria = session.createCriteria(Employee.class);
			
			Criterion c1 = Restrictions.like("department", "Developer");
			Criterion c2 = Restrictions.like("department", "tester");
			
			LogicalExpression andExp = Restrictions.and(c1, c2);
			criteria.add( andExp );
			System.out.println(1);
			
			//List results = criteria.list();
			
			List<Employee> list = criteria.list();
			for (Employee emp : list) {
				System.out.println(emp);
			}
		}

	}

