package Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Students;

public class main {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Students.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Students s = new Students();
		s.setStud_age(21);
		s.setStud_id(1);
		s.setStud_name("Saloni");
		s.setStud_city("pune");
		ss.persist(s); //you can use save
		System.out.println(s);
		tr.commit();
		System.out.println("Application is started");
	}
}
