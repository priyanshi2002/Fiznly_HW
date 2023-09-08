package criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import common.hibernateConfig;
import employee.emp;

public class Like {
public static void main(String[] args) {
	SessionFactory sf=hibernateConfig.getSessionFactory();
	Session session=sf.openSession();
	Criteria criteria = session.createCriteria(emp.class);
	criteria.add(Restrictions.like("department", "dev"));
    List<emp> l=criteria.list();
    for(emp e:l)
    {
    	System.out.println(e);
    }
}
}
