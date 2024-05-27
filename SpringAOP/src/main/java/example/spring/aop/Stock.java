package example.spring.aop;

public class Stock {
	
	private int id;
	
	private String name;
	
	private int stockprice;
	
	
	public Stock() {
		// TODO Auto-generated constructor stub
	}

	public Stock(int id, String name, int stockprice) {
		this.name = name;
		this.id = id;
		this.stockprice = stockprice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return id;
	}

	public void setPrice(int price) {
		this.id = price;
	}

	public int getStockprice() {
		return stockprice;
	}

	public void setStockprice(int stockprice) {
		this.stockprice = stockprice;
	}

	@Override
	public String toString() {
		return "Stock [name=" + name + ", price=" + id + ", stockprice=" + stockprice + "]";
	}
	
}
