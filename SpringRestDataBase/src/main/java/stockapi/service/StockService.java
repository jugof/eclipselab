package stockapi.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stockapi.entity.Stock;
import stockapi.repository.IStockRepository;

@Service
public class StockService {
	
	@Autowired(required = false) //injecting repository into Service
	private IStockRepository stockRepoRef;
	
	public Collection<Stock> getAllStocks() {
		Collection<Stock> allStocks = stockRepoRef.findAll();
		return allStocks;
	}
	
	public Stock getOneStock(int id) {
		Stock foundStock = null;
		Optional<Stock> stockOpt = stockRepoRef.findById(id);
		
		if(stockOpt.isPresent()) {
			foundStock = stockOpt.get();
		}
		return foundStock;
	}
	
	public void addStock(Stock stockObj) {
		stockRepoRef.save(stockObj);
	}
	
	public Stock getStockBasedEstYear(int min, int max){
		return null;
	}
	
	public void deleteStockById(Integer id) {
		stockRepoRef.deleteById(id);
	}
}
