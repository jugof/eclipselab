package demo.mongodb.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import demo.mongodb.spring.model.Task;
import demo.mongodb.spring.service.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {

	@Autowired
	private TaskService service;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Task addTask( @RequestBody Task task) {
		return service.addTask(task);
	}
	
	@GetMapping
	public List<Task> findAllTasks(){
		return service.findAllTasks();
	}
	
	@GetMapping("/{id}")
	public Task getTaskById( @PathVariable String id) {
		return service.getTaskById(id);
	}
	
	@GetMapping("/severity/{severity}")
	public List<Task> getTaskBySeverity( @PathVariable int severity) {
		return service.getTaskBySeverity(severity);
	}
	
	@GetMapping("/assignee/{assignee}")
	public List<Task> getTaskByAssignee( @PathVariable String assignee) {
		return service.getTaskByAssignee(assignee);
	}
	
	@PutMapping
	public Task updateTask( @RequestBody Task taskReq) {
		return service.updateTask(taskReq);
	}
	
	@DeleteMapping("/{taskId}")
	public String deleteTask( @PathVariable String taskId) {
		return service.deleteTask(taskId);
	}
	
}
