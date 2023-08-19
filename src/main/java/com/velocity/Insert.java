package com.velocity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insert {

	public static void main(String[] args) {
	        Configuration cfg =new Configuration();
	        cfg.configure("com/velocity/hibernate.cfg.xml");
	        
	        SessionFactory sessionFactory=cfg.buildSessionFactory();
	        Session session=sessionFactory.openSession();
	        
	        Transaction transaction = session.beginTransaction();
	        
	        // Insert data
	        Employee emp1=new Employee();
	        emp1.setFullName("sagar patil");
	        emp1.setAge(30);
	        emp1.setCity("pune");
	        emp1.setSalary(30000);
	        
	        Employee emp2=new Employee();
	        emp2.setFullName("vishal patil");
	        emp2.setAge(25);
	        emp2.setCity("Ratnagiri");
	        emp2.setSalary(21000);
	        
	        Employee emp3=new Employee();
	        emp3.setFullName("sakshi dakhite");
	        emp3.setAge(24);
	        emp3.setCity("Dhule");
	        emp3.setSalary(30000);
	        
	        session.save(emp1);
	        session.save(emp2);
	        session.save(emp3);
	        transaction.commit();
	        session.close();
	        System.out.println("All records added");
	        }

}
