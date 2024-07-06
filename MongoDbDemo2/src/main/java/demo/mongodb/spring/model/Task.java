package demo.mongodb.spring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Task")
public class Task {

	@Id
	private String taskId;
	private String description;
	private int severity;
	private String assign;
	private int storyPoint;
	
	
	public Task() {
		super();
	}


	public Task(String taskId, String description, int severity, String assign, int storyPoint) {
		super();
		this.taskId = taskId;
		this.description = description;
		this.severity = severity;
		this.assign = assign;
		this.storyPoint = storyPoint;
	}


	public String getTaskId() {
		return taskId;
	}


	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getSeverity() {
		return severity;
	}


	public void setSeverity(int severity) {
		this.severity = severity;
	}


	public String getAssign() {
		return assign;
	}


	public void setAssign(String assign) {
		this.assign = assign;
	}


	public int getStoryPoint() {
		return storyPoint;
	}


	public void setStoryPoint(int storyPoint) {
		this.storyPoint = storyPoint;
	}
	
	
	
}
