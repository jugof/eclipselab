package demo.mongodb.connection.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import demo.mongodb.connection.model.GroceryItem;
import demo.mongodb.connection.repository.ItemRepository;

@RestController
@CrossOrigin
public class ItemController {

	
	@Autowired
	private ItemRepository itemRepoRef;
	
	@GetMapping("/find")
	List<GroceryItem> findAll(){
		return itemRepoRef.findAll();
	}
	
	@GetMapping("/find-item/{name}")
	GroceryItem findItemByName( @PathVariable String name) {
		return itemRepoRef.findItemByName(name);
	}
	
	
	@GetMapping("/find/{category}")
	List<GroceryItem> findAll( @PathVariable String category){
		return itemRepoRef.findAll(category);
	}
	
//	GroceryItem save(GroceryItem itm) {
//		return itemRepoRef.save(itm);
//	}
}
