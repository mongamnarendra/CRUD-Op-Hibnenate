package com.demo.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory factory = buildSessionFactory();
	
	private static  SessionFactory buildSessionFactory() {
		return new Configuration().configure().addAnnotatedClass(com.demo.model.User.class).buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		return factory;
	}
	

}
