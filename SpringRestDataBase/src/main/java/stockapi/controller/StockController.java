package stockapi.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import stockapi.entity.Stock;
import stockapi.service.StockService;

@RestController
public class StockController {
	
	@Autowired
	private StockService stockServiceRef;
	
	@GetMapping("/stock-data-api")
	public Collection<Stock> getAllStocks() {
		Collection<Stock> allStocks = stockServiceRef.getAllStocks();
		return allStocks;
	}
	
	@GetMapping("/stock-data-api/{reqsId}")
	public Stock getOneStock(@PathVariable("reqsId") int id) {
		return stockServiceRef.getOneStock(id);
	}
	
	@PostMapping("/stock-data-api")
	public void addStock(@RequestBody Stock stockObj) {
		System.out.println(stockObj);
		stockServiceRef.addStock(stockObj);
	}
	
	@GetMapping("/stock-data-api/{min}/{max}")
	public Stock getStockBasedEstYear(@PathVariable int min, @PathVariable int max){
		return stockServiceRef.getStockBasedEstYear(min, max);
	}
	
	@DeleteMapping("/stock-data-api/{id}")
	public void deleteStockById(@PathVariable Integer id) {
		stockServiceRef.deleteStockById(id);
	}
}
