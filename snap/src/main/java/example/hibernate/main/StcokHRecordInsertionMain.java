package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.StockHolder;
import example.hibernate.utils.HibernateUtils;

public class StcokHRecordInsertionMain {

	public static void main(String[] args) {
		try(
				SessionFactory factory = 
				HibernateUtils.getSessionFactory();
				Session sessionRef = 
						factory.openSession();
				){
			StockHolder stockholderRef = 
					new StockHolder(6969, "Aatif Aslam", "aatif@hotmail.com");
			Transaction tx = sessionRef.beginTransaction();
				sessionRef.persist(stockholderRef);
			tx.commit();
			System.out.println("StockHolder added successfully.");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}