package javaexam2015;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private int matrikel;
	private String lastName;
	private String firstName;
	private ArrayList<Course> courses = new ArrayList<Course>();
	
	public Student(int matrikel, String lastName, String firstName) {
		this.matrikel = matrikel;
		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	public Student(int matrikel, String lastName, String firstName, List<Course> courses) {
		this.matrikel = matrikel;
		this.lastName = lastName;
		this.firstName = firstName;
		this.courses.addAll(courses);
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public int getMatrikel() {
		return matrikel;
	}
	
	public void addCourse(Course course) {
		courses.add(course);
	}
	
	public List<Course> getCourses() {
		return courses;
	}

	@Override
	public String toString() {
		return "Student [matrikel=" + matrikel + ", lastName=" + lastName + ", firstName=" + firstName + ", courses="
				+ courses + "]";
	}
	
	
}
