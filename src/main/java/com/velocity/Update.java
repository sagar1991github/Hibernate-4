package com.velocity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {
		  Configuration cfg =new Configuration();
	        cfg.configure("com/velocity/hibernate.cfg.xml");
	        
	        SessionFactory sessionFactory = cfg.buildSessionFactory();
	        Session session = sessionFactory.openSession();
	        
	        Transaction transaction = session.beginTransaction();
	        
	        // update the data
	        Employee employee = session.get(Employee.class,4);
	        employee.setFullName("Arun patil");
	        session.update(employee);
	        transaction.commit();
	        session.close();
	        sessionFactory.close();
	        System.out.println("All Records updated");
	        

	}

}
