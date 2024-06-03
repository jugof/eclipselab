package stockapi.storage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import stockapi.entity.Stock;

public class StockStorage {
	//will store stock data here in class in memory
	private static Map<Integer, Stock> stockMap;
	
	static {
		stockMap = new HashMap<>();
		Stock st1 = new Stock(101, "Tesla Motors", 420, 2001);
		Stock st2 = new Stock(102, "GM Motors", 340, 1967);
		Stock st3 = new Stock(103, "Tata Motors", 69, 1990);
		Stock st4 = new Stock(104, "Ford Motors", 137, 1887);
		
		stockMap.put(st1.getId(), st1);
		stockMap.put(st2.getId(), st2);
		stockMap.put(st3.getId(), st3);
		stockMap.put(st4.getId(), st4);
	}
	
//	method to return all Stocks
	public static Collection<Stock> getAllStocks() {
		Collection<Stock> allAvailableStocs = stockMap.values();
		return allAvailableStocs;
	}
	
	//method to return single stock based upon id 
	public static Stock getOneStock(int id) {
		Stock stockRef = stockMap.get(id);
		return stockRef;
	}
	
	//method to insert a stock in Storage
	public static void addStock(Stock stockObj) {
		stockMap.put(stockObj.getId(), stockObj);
	}
	
	//getting a stock based upon the in between min & max year
	public static Stock getStockBasedEstYear(int min, int max) {
		Stock stocksEst = null;
		
		for(Map.Entry<Integer, Stock> set : stockMap.entrySet() ) {
			
			int estYr = set.getValue().getEstYear();
			if(estYr >= min && estYr <= max ) {
				Stock st = (Stock)set.getValue();
				return st;
			}
		}
		return stocksEst;
	}
}
