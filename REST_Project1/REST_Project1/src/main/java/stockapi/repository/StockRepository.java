package stockapi.repository;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import stockapi.entity.Stock;
import stockapi.storage.StockStorage;

@Repository
public class StockRepository {
	//this class is interact with storage to perform CRUD ops
	public Collection<Stock> getAllStock() {
		Collection<Stock> allStock = StockStorage.getAllStocks();
		return allStock;
	}
	
	public Stock getOneStock(int id) {
		return StockStorage.getOneStock(id);
	}
	
	public void addStock(Stock stockObj) {
		StockStorage.addStock(stockObj);
	}
	
	public Stock getStockBasedEstYear(int min, int max) {
		return StockStorage.getStockBasedEstYear(min, max);
	}
}
