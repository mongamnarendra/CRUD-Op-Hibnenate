package com.demo;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.dao.UserDao;
import com.demo.model.User;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		

		while(true) {
			System.out.println("1.add\t2.fetch by id \t 3.fetch all users \t 4.update user \t 5.delete user \t 6.Exit");
			System.out.println("Enter your option:");
			int useropt = scanner.nextInt();
			switch (useropt) {
			case 1:
				System.out.println("Enter user name");
				String name = scanner.next();
				System.out.println("Enter course");
				String course= scanner.next();
				
				User user = new User() ;
				user.setAname(name);
				user.setTech(course);
				UserDao.add(user);
				break;
				
			case 2:
				System.out.println("Enter User ID to fetch");
				int userid=scanner.nextInt();
				User u=UserDao.getById(userid);
				System.out.println("user name is "+u.getAname()+" course is "+u.getTech()+" and id is "+u.getAid());
				break;
			case 3:
				 System.out.println("User Data in the table is :-");
				 List<User> users = UserDao.getAllUsers();
				 if(users.size()==0) {
					 System.out.println("No Data Found");
				 }
				 for(User ul : users) {
					 System.out.println("user name is "+ul.getAname()+" course is "+ul.getTech()+" and id is "+ul.getAid());
				 }
				 break;
			
			case 4:
				System.out.println("Enter username id");
				int userid2 = scanner.nextInt();
				User preUser = UserDao.getById(userid2);
				System.out.println("user name is "+preUser.getAname()+" course is "+preUser.getTech()+" and id is "+preUser.getAid());
				
				System.out.println("Enter updated name");
				String updatedName = scanner.next();
				System.out.println("Enter updated course");
				String updatedTech = scanner.next();
				User updatedUser = new User();
				updatedUser.setAid(userid2);
				updatedUser.setAname(updatedName);
				updatedUser.setTech(updatedTech);
				UserDao.updateUser(updatedUser);
				break;
				
			case 5:
				System.out.println("Enter user id");
				int id = scanner.nextInt();
				UserDao.deleteUser(id);
				break;
				
			default:
				System.out.println("Program Exited");
				System.exit(0);
			}
		}

	}

}
