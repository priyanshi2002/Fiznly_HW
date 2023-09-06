package hibernet;

   import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;

	public class Delete {

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
			
			session.delete(st);
			System.out.println("Data Deleted successfuly");
			tr.commit();
			session.close();
		}

}
