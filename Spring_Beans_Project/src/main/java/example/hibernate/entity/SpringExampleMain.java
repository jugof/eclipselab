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
		s.setName("Lenovo");
		s.setStockPrice(1000);
		s.setStockId(301);
		
		System.out.println(s.toString());
		
		Object loaded = ctx.getBean("st2");
		StockHolder sh = (StockHolder)loaded;
		sh.setAccountNo(6201);
		sh.setName("Aatif");
		sh.setEmail("aatif@gmail.com");
		
		System.out.println(sh.toString());
		
		Object loadedObject = ctx.getBean("st3");
		Student std = (Student)loadedObject;
		std.setDegree("MBBS-[Neurologist]");
		std.setName("Dr. Tejal Salunke");
		std.setStudentId(120);
		System.out.println(std.toString());
	}

}
