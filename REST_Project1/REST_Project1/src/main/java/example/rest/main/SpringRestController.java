package example.rest.main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.rest.entity.Stock;

@RestController
public class SpringRestController  {
	
	@RequestMapping("/idiot")
	public String idiot() {
		return "Welcome to your idotic world Bhaagguu!!!";
	}
	
	@RequestMapping("/obj")
	public Stock getStock() {
		return new Stock(101, "SpaceX", 6969, 2002);
	}
	
	
}
