package com.app;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestClass {
	public static void main(String[] args) {
		Configuration cfg=null;
		SessionFactory sf=null;
		Session ses=null;
		Transaction tx=null;
		//activate the hibernate framework
			cfg=new Configuration().configure("hibernate.cfg.xml");
			//build the session factory
			sf=cfg.buildSessionFactory();
			//open/get the session
			ses=sf.openSession();
			
			//create the model class object and set the data
			Compid cid=new Compid();
			Employee e=new Employee();
			cid.setId(10);
			cid.setName("Pratik");
			e.setCid(cid);
			e.setSal(12.36f);
						
			try {
				//begin the transaction
				tx=ses.beginTransaction();
				//save the data
				ses.save(e);
				tx.commit();
				System.out.println("\n\t\t***Data is Inserted***");
				
			} catch (Exception e2) {
				tx.rollback();
				e2.printStackTrace();
			}finally {
				try {
					//close the session factory and session
					ses.close();
					sf.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			
		
	}//main ends

}//class ends
