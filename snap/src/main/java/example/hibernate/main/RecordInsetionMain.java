package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.Stock;
import example.hibernate.entity.StockHolder;
import example.hibernate.utils.HibernateUtils;

public class RecordInsetionMain {

	public static void main(String[] args) {
		try(
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session sessionRef = factory.openSession()
			){
			Stock stockRef = new Stock(107, "SpaceX ", 88);
		
			Transaction tx = sessionRef.beginTransaction();
				sessionRef.persist(stockRef);
	
			tx.commit();
			System.out.println("Stock added successfully.");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}