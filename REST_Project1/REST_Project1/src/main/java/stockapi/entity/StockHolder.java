package stockapi.entity;

import java.util.List;

public class StockHolder {
	
	private int id;
	private List<Stock> stockRef;
	private int holding;

	public StockHolder() {
		// TODO Auto-generated constructor stub
	}

	public StockHolder(int id, List<Stock> stockRef, int holding) {
		super();
		this.id = id;
		this.stockRef = stockRef;
		this.holding = holding;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Stock> getStockRef() {
		return stockRef;
	}
	
	public void setOneStock(Stock oneStock) {
		this.stockRef.add(oneStock);
	}
	
	public Stock getOneStock(int stockId) {
		return this.stockRef.get(stockId);
	}

	public void setStockRef(List<Stock> stockRef) {
		this.stockRef = stockRef;
	}

	public int getHolding() {
		return holding;
	}

	public void setHolding(int holding) {
		this.holding = holding;
	}

	@Override
	public String toString() {
		return "StockHolder [id=" + id + ", stockRef=" + stockRef + ", holding=" + holding + "]";
	}
	
	

}
