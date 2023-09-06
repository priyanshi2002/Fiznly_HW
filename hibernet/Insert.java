package hibernet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insert {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		Configuration addAnnotatedClass = cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
        Transaction tr = session.beginTransaction();
        Student st = new Student();
		st.setId(1);
		st.setName("Priya");
		st.setAge("21");
		session.save(st);
		System.out.println("Data saved successfuly");
		Tr.commit();
		session.close();
	}
}
