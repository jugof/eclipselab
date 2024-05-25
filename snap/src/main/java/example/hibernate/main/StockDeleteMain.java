package example.hibernate.main;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.Stock;
import example.hibernate.utils.HibernateUtils;

public class StockDeleteMain {
	
	public static void main(String[] args) {
		
		try(
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session sessionRef = factory.openSession();
				){
			Class<Stock> entityType = Stock.class;
			Serializable id = 102;
			
			Stock foundStock = sessionRef.find(entityType, id);
			
			Transaction tx = sessionRef.beginTransaction();
			
				sessionRef.remove(foundStock);
			tx.commit();
			System.out.println("Record Deleted successfully!!");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
}
