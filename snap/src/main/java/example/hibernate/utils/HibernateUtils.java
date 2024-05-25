package example.hibernate.utils;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import example.hibernate.entity.Stock;
import example.hibernate.entity.StockHolder;

public class HibernateUtils {
	public static SessionFactory getSessionFactory() {
		Configuration hibernateConfig = 
				new Configuration();
		
		Properties hibernateProperties = 
				new Properties();
		
		hibernateProperties.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/cdac");
		hibernateProperties.put("hibernate.connection.username", "root");
		hibernateProperties.put("hibernate.connection.password", "password");
		hibernateProperties.put("hibernate.show_sql", "true");
		hibernateProperties.put("hibernate.hbm2ddl.auto", "update");
		
		hibernateConfig.setProperties(hibernateProperties);
		//Registering the Entity class with Configuration
		Class<Stock> entityClass = Stock.class;
		Class<StockHolder> entityClas2 = StockHolder.class;
		hibernateConfig.addAnnotatedClass(entityClas2);
		hibernateConfig.addAnnotatedClass(entityClass);
		SessionFactory factory = hibernateConfig.buildSessionFactory();
		return factory;
		
	}
}