package example.hibernate.main;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.Stock;
import example.hibernate.utils.HibernateUtils;

public class StockUpdateMain {

	public static void main(String[] args) {
		try(
				SessionFactory factory = 
				HibernateUtils.getSessionFactory();
				Session sessionRef = 
						factory.openSession()
				){
			Class<Stock> entityType = Stock.class;
			Serializable id = 106;
			
			Stock foundStock = 
					sessionRef.find(entityType, id);
			Transaction tx = sessionRef.beginTransaction();
				//Changing title and year
				foundStock.setName("Alpha Base");
				foundStock.setStockPrice(420);
			tx.commit();
			System.out.println("Stock updated successfully");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}