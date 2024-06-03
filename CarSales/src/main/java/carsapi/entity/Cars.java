
package carsapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cars_table")
public class Cars {
	
	@Id
	@Column(name = "car_id")
	private int id;
	
	@Column(name = "manufacturer")
	private String maker;
	
	@Column(name = "car_model")
	private String model;
	
	@Column(name = "car_price")
	private int price;
	
	@Column(name = "manufaturing_year")
	private int year;
	
	public Cars() {
		// TODO Auto-generated constructor stub
	}

	public Cars(int id, String maker, String model, int price, int year) {
		super();
		this.id = id;
		this.maker = maker;
		this.model = model;
		this.price = price;
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Cars [id=" + id + ", maker=" + maker + ", model=" + model + ", price=" + price + ", year=" + year + "]";
	}
	
	
}
