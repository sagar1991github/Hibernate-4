package com.velocity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {

	public static void main(String[] args) {
		Configuration cfg =new Configuration();
        cfg.configure("com/velocity/hibernate.cfg.xml");
        
        SessionFactory sessionFactory=cfg.buildSessionFactory();
        Session session=sessionFactory.openSession();
        
        Transaction transaction = session.beginTransaction();
        
        // Delete the data
        Employee employee =session.get(Employee.class,1);
        session.delete(employee);
        session.getTransaction().commit();
        session.close();
        transaction.commit();
        System.out.println("record Delete");
        

	}

}
