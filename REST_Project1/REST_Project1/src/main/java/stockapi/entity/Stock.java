/**
 * 
 */
package stockapi.entity;

/**
 * 
 */
public class Stock {

	private int id;
	private String name;
	private int price;
	private int estYear;
	
	public Stock() {
		// TODO Auto-generated constructor stub
	}

	public Stock(int id, String name, int price, int estYear) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.estYear = estYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getEstYear() {
		return estYear;
	}

	public void setEstYear(int estYear) {
		this.estYear = estYear;
	}

	@Override
	public String toString() {
		return "Stock [id=" + id + ", name=" + name + ", price=" + price + ", estYear=" + estYear + "]";
	}
	
}
