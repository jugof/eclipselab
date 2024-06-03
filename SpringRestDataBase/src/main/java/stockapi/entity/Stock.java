/**
 * 
 */
package stockapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "stock_tab")
public class Stock {
	
	@Id
	@Column(name = "st_id")
	private int id;
	
	@Column
	private String name;
	
	@Column
	private int price;
	
	@Column
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
