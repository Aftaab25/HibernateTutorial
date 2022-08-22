package com.chromiumhead.MavenTut;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("Project Started...");
		SessionFactory factory = new Configuration()
				.configure()
				.buildSessionFactory();
//		System.out.println(factory);
		
//		Creating a Student
		Student st = new Student();
		st.setSid(102);
		st.setSname("Rakesh");
		st.setCity("Delhi");
//		System.out.println(st);
		
//		Creating an address Object
		Address addr = new Address();
		addr.setStreet("street xyz");
		addr.setCity("City XYZ");
		addr.setOpen(true);
		addr.setX(234.435);
		addr.setAddedDate(new Date());
		
		FileInputStream fis = new FileInputStream("src/main/java/aaronphs_indonesia.jpg");
		byte[] data = new byte[fis.available()];
		addr.setImage(data);
		
		// Getting Current Session
		Session session = factory.getCurrentSession();
		
		// Begin Transaction
		Transaction tx = session.beginTransaction();
		session.save(st); // Save the object
		session.save(addr);
		
		// Committing the Transaction
		tx.commit();
		
		// Close the session
		session.close();
		
	}
}
