package com.velocity;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Select {

	public static void main(String[] args) {
		Configuration cfg =new Configuration();
        cfg.configure("com/velocity/hibernate.cfg.xml");
        
        SessionFactory sessionFactory=cfg.buildSessionFactory();
        Session session=sessionFactory.openSession();
        
        Transaction transaction = session.beginTransaction();
        
        // select the data
        Query query=session.createQuery("from Employee");
        List<Employee> empList = query.list();
        //empList.stream().forEach(x->System.out.println(x));
        for(Employee e : empList) {
        	System.out.println("ID >"+e.getId());
        	System.out.println("FullName >"+e.getFullName());
        	System.out.println("City >"+e.getCity());
        	System.out.println("Age >"+e.getAge());
        	System.out.println("Salary >"+e.getSalary());
        	
        }
        transaction.commit();
        session.close();
        sessionFactory.close();
        System.out.println("record is printed on console!!!!!!!!!!!!!!");

	}

}
