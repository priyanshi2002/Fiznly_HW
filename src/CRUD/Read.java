package CRUD;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import common.hibernateConfig;
import employee.emp;

public class Read {
public static void main(String[] args) {
	SessionFactory sf=hibernateConfig.getSessionFactory();
	Session session = sf.openSession();
	Criteria criteria = session.createCriteria(emp.class);
	List<emp>list = criteria.list();
	for(emp e:list)
	{
		System.out.println(e);
	}
}
}
