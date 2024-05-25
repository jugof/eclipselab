package example.hibernate.main;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import example.hibernate.entity.Stock;
import example.hibernate.utils.HibernateUtils;

public class StockRetrivalMain {
	
	public static void main(String args[]) {
		try (
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session sessionRef = factory.openSession();
				){
			//select * from stock_table where stock_id = 105;
			Class<Stock> entityType = Stock.class;
			Serializable id = 105;
			
			Stock foundSt = sessionRef.find(entityType, id);
			
			if(foundSt != null)
				System.out.println(foundSt);
			else
				System.out.println("Stock with given credentials not available!!");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
