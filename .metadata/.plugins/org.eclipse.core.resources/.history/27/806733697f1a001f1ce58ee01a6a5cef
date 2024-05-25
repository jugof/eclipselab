package example.hibernate.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String configLocation = "./src/main/resources/spring-config.xml";
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext(configLocation);
		
		Object loadedObj = ctx.getBean("st1");
		Stock s = (Stock)loadedObj;
		
		System.out.println(s.toString());
		
		Object loaded = ctx.getBean("st2");
		StockHolder sh = (StockHolder)loaded;
		
		System.out.println(sh.toString());
	}

}
