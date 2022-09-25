package com.hibernate.hbr_maaping_xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		session.beginTransaction();
		session.save(new Customer(21, "Vikash Kumar", "Ranchi"));
		session.getTransaction().commit();
		
		
		session.close();
		factory.close();
		
	}
}
