package demo.mongodb.connection.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Task {
	
	private String taksId;
	private String description;
	private int severity;
	private String assignee;
	private int storyPoint;
}
