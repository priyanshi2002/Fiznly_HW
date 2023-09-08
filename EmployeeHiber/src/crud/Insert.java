package crud;

import employee.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import coomon.hibernateConfig;

public class Insert {
	public static void main(String[] args) {

		SessionFactory sf = hibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Employee e = new Employee();
		e.setId(3);
		e.setFirstname("Harshita");
		e.setSecondname("Grehwal");
		e.setSalary("40000");
		e.setDob("10/9/2000");
		e.setDepartment("hr");
		e.setEmail("harshita@2002");
		session.save(e);
		tr.commit();
		System.out.println("Data done");

	}
}
