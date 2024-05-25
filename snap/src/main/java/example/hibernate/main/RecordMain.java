package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import example.hibernate.entity.Student;

public class RecordMain{
	public static void main(String[] args) {
		
		Configuration hibernateConfig = new Configuration();
		hibernateConfig = hibernateConfig.configure();
		
//		obtaining session factory
		SessionFactory hibernateFactory = hibernateConfig.buildSessionFactory();
		
		Session hibernateSession = hibernateFactory.openSession();
		
		//creating entity class object
		Student doctorRef = new Student(105, "Teju Rajput", "Vetnary");
		
		//obtaining starting transaction 
		Transaction hibernateTransaction = hibernateSession.beginTransaction();
		
		//storing the entity
		hibernateSession.persist(doctorRef);
		
		//commiting the transaction
		hibernateTransaction.commit();
		
		//closing the session
		hibernateSession.close();
		
		//closing the factory
		hibernateFactory.close();
		
		//closing the session factory
		hibernateFactory.close();
		
		System.out.println("Record added in table successfully!");
	}
}