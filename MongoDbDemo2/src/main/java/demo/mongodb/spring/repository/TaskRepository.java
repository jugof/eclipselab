package demo.mongodb.spring.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import demo.mongodb.spring.model.Task;

public interface TaskRepository extends MongoRepository<Task, String> {

	public List<Task> findBySeverity(int severity);
	
	@Query("{assign : ?0 }")
	public List<Task> getTaskByAssignee(String assignee);
	
}
