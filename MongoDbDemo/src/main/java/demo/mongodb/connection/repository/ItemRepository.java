package demo.mongodb.connection.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import demo.mongodb.connection.model.GroceryItem;

public interface ItemRepository extends MongoRepository<GroceryItem, String> {
	
	@Query("{name:'?0'}")
	GroceryItem findItemByName(String name);
	
	@Query(value="{category:'?0'}", fields= "{'name' : 1, 'quantity' : 1}")
	List<GroceryItem> findAll(String category);
	
	List<GroceryItem> findAll();
	
	
//	 GroceryItem save(GroceryItem item);
	
	public long count();
}
