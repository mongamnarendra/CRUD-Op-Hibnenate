package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.demo.model.User;
import com.demo.util.HibernateUtil;

public class UserDao {
	
	public static void add(User user) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			Transaction transaction = session.beginTransaction();
			session.persist(user);
			transaction.commit();
		}
		catch (Exception e) {
			System.out.println("error occured");
		}
	}
	
	public static List<User> getAllUsers() {
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			
			return session.createQuery("from User",User.class).getResultList();                   //here from user to fetch data frrom database table and user.class is to return the result in a list of user objects
		}
	}
	
	public static User getById(int id) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			return session.find(User.class, id);
		}
	}
	
	public static void updateUser(User user) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			Transaction transaction = session.beginTransaction();
			session.merge(user);
			transaction.commit();
		}
	}
	
	public static void deleteUser(int id) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			Transaction transaction = session.beginTransaction();
			User user = getById(id);
			session.remove(user);
			transaction.commit();
		}catch(Exception e) {
			System.out.println("There is no record found with the id");
		}
	}
}
