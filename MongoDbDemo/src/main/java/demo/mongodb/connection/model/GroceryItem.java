package demo.mongodb.connection.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("GroseryItem")
public class GroceryItem {
	
	@Id
	private String id;
	
	private String name;
	
	private String category;
	 
	private int quantity;
	
	

	public GroceryItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GroceryItem(String id, String name, String category, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.quantity = quantity;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
