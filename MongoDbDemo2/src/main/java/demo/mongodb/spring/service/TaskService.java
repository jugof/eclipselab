package demo.mongodb.spring.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.mongodb.spring.model.Task;
import demo.mongodb.spring.repository.TaskRepository;

@Service
public class TaskService {
	
	@Autowired
	private TaskRepository repoRef;
	
	//	CRUD 
	//	Create
	public Task addTask(Task task) {
		task.setTaskId(UUID.randomUUID().toString().split("-")[0]);
		return repoRef.save(task);
	}
	
	//Read
	public List<Task> findAllTasks() {
		return repoRef.findAll();
	}
	
	//Read return single task by ID
	public Task getTaskById(String id) {
		return repoRef.findById(id).get();
	}
	
	//Read single task return based on severity
	public List<Task> getTaskBySeverity(int severity){
		return repoRef.findBySeverity(severity);
	}
	
	//Read get task using Assignee
	public List<Task> getTaskByAssignee(String assignee){
		return repoRef.getTaskByAssignee(assignee);
	}
	
	//Udate
	public Task updateTask(Task taskReq) {
		//get the existing document from db 
		//populate new value from req from object/entity/documnet
		Task existingTask = repoRef.findById(taskReq.getTaskId()).get();
		existingTask.setDescription(taskReq.getDescription());
		existingTask.setSeverity(taskReq.getSeverity());
		existingTask.setAssign(taskReq.getAssign());
		existingTask.setStoryPoint(taskReq.getStoryPoint());
		
		return repoRef.save(existingTask);
	}
	
	// Delete
	public String deleteTask(String taskId) {
		repoRef.deleteById(taskId);
		return taskId + " Task deleted from dashboard ";
	}
	
}
