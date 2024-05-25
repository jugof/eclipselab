package example.hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Stock_Table")
public class Stock {
	
	@Id
	@Column(name = "stock_id")
	private int stockId;
	
	@Column(name = "stock_name")
	private String name;
	
	@Column(name = "stock_price")
	private int stockPrice;
	
	public Stock() {
		
	}

	public Stock(int stockId, String name, int stockPrice) {
		this.stockId = stockId;
		this.name = name;
		this.stockPrice = stockPrice;
	}

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(int stockPrice) {
		this.stockPrice = stockPrice;
	}

	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", name=" + name + ", stockPrice=" + stockPrice + "]";
	}
	
}