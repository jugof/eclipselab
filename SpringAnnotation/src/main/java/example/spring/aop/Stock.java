package example.spring.aop;

public class Stock {
	
	private String name;
	
	private int price;
	
	private int stockprice;
	
	

	public Stock() {
		// TODO Auto-generated constructor stub
	}

	public Stock(String name, int price, int stockprice) {
		this.name = name;
		this.price = price;
		this.stockprice = stockprice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStockprice() {
		return stockprice;
	}

	public void setStockprice(int stockprice) {
		this.stockprice = stockprice;
	}

	@Override
	public String toString() {
		return "Stock [name=" + name + ", price=" + price + ", stockprice=" + stockprice + "]";
	}
	
}
