package example.hibernate.entity;

public class Student{
	private int studentId;
	private String name;
	private String degree;
	
	
	
	public Student() {
		
	}



	public Student(int studentId, String name, String degree) {
		this.studentId = studentId;
		this.name = name;
		this.degree = degree;
	}



	public int getStudentId() {
		return studentId;
	}



	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDegree() {
		return degree;
	}



	public void setDegree(String degree) {
		this.degree = degree;
	}



	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", degree=" + degree + "]";
	}
	
	
	
}