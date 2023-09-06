package hibernet;

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;

	public class Read {

		public static void main(String[] args) {

			Configuration cfg = new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(Student.class);
			SessionFactory sf = cfg.buildSessionFactory();
			Session session = sf.openSession();
			Transaction tr = session.beginTransaction();
			Student st = session.load(Student.class, 1);
			System.out.println(st);
			tr.commit();
			session.close();
		}
	}

}
