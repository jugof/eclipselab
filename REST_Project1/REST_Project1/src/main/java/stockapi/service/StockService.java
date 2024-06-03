package stockapi.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stockapi.entity.Stock;
import stockapi.repository.StockRepository;

@Service
public class StockService {
	
	@Autowired(required = false) //injecting repository into Service
	private StockRepository stockRepoRef;
	
	public Collection<Stock> getAllStocks() {
		Collection<Stock> allStocks = stockRepoRef.getAllStock();
		return allStocks;
	}
	
	public Stock getOneStock(int id) {
		return stockRepoRef.getOneStock(id);
	}
	
	public void addStock(Stock stockObj) {
		stockRepoRef.addStock(stockObj);
	}
	
	public Stock getStockBasedEstYear(int min, int max){
		return stockRepoRef.getStockBasedEstYear(min, max);
	}
}
