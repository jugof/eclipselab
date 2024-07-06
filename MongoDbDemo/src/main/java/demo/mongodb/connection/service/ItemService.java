package demo.mongodb.connection.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.mongodb.connection.model.GroceryItem;
import demo.mongodb.connection.repository.ItemRepository;

@Service
public class ItemService {
	
	@Autowired
	private ItemRepository itemRepoRef;
	
	GroceryItem findItemByName(String name) {
		return itemRepoRef.findItemByName(name);
	}
	
	List<GroceryItem> findAll(String category){
		return itemRepoRef.findAll(category);
	}
	
	void saveItem(GroceryItem itm) {
		itemRepoRef.save(itm);
	}
}
