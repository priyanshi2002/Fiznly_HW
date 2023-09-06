package hibernet;

import java.lang.module.Configuration;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Update {

		public static void main(String[] args) {
			
			Configuration cfg = new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(Student.class);
			SessionFactory sf = cfg.buildSessionFactory();
			Session session = sf.openSession();
			Transaction tr = session.beginTransaction(); 
			Student st = new Student();
			st.setId(1);
			st.setName("Priyanshi");
			st.setAge("20");
			
			session.update(st);
			System.out.println("Data updated successfuly");
			tr.commit();
			session.close();
		

}
