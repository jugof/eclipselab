package spring.demo.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.rest.entity.Stock;

@RestController
public class SpringRestController {
	
	@RequestMapping("/shit")
	public String akshit() {
		return "Ak-shiiitt is Learning ";
	}
	
	@GetMapping("/teju")
	public Stock stk() {
		Stock stockObj = new Stock(101, "Dr. Tejal Pvt Lmt.", 420, 2000);
		System.out.println(stockObj);
		return stockObj;
	}
}
