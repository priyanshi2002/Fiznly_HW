package crud;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import coomon.hibernateConfig;
import employee.Employee;

public class Read {
public static void main(String[] args) {
	SessionFactory sf=hibernateConfig.getSessionFactory();
	Session session = sf.openSession();
	Criteria criteria = session.createCriteria(Employee.class);
	List<Employee>list = criteria.list();
	for(Employee e:list)
	{
		System.out.println(e);
	}
}
}
