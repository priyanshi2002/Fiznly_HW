package criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import coomon.hibernateConfig;
import employee.Employee;

public class Sort {

	public static void main(String[] args) {

		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.addOrder(Order.desc("salary"));
		List<Employee> list = criteria.list();
		for (Employee emp : list) {
			System.out.println(emp);
		}
	}
}
