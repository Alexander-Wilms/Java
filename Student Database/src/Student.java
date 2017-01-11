import java.util.ArrayList;
import java.util.Comparator;

public class Student {
	private String name;
	private String firstName;
	private int matrikel;
	private ArrayList<Course> courses;
	private int NoOfCourses;
	private int maxCourses;
	
	public static final int KEINENOTE = 99;
	
	public Student(String name, String firstName, int matrikel, int maxCourses) {
		this.name = name;
		this.firstName = firstName;
		this.matrikel = matrikel;
		this.maxCourses = maxCourses;
		
		courses = new ArrayList<Course>();
	}
	
	public Student(Student student) {
		this.name = student.getName();
		this.firstName = student.getFirstName();
		this.matrikel = student.getMatrikel();
		courses = new ArrayList<Course>();
		this.courses.addAll(student.getCourses());
		this.NoOfCourses = student.NoOfCourses;
		this.maxCourses = student.getMaxCourses();
	}
	
	public void print() {
		System.out.println(this);
	}
	
	public String toString() {
		return "name: " + getName() + ", firstName: " + getFirstName() + ", matrikel: " + getMatrikel() + ", Courses: " + getCourses() + ", NoOfCourses: " + getNoOfCourses() + ", maxCourses: " + getMaxCourses() + ", averageMark: " + calculateAverageMark() + "\n";
	}

	public String getName() {
		return name;
	}

	public String getFirstName() {
		return firstName;
	}

	public int getMatrikel() {
		return matrikel;
	}
	
	public void setMatrikel(int matrikel) {
		this.matrikel = matrikel;
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public int getNoOfCourses() {
		return NoOfCourses;
	}

	public int getMaxCourses() {
		return maxCourses;
	}
	
	public void addCourse(String name, int courseID, String professor) {
		Course newCourse = new Course(courseID, name, professor);
		boolean existsAlready = false;
		for(Course thisCourse : courses) {
			if(thisCourse.CourseID == courseID)
				existsAlready = true;
		}
		
		if(!existsAlready) {
			courses.add(newCourse);
			NoOfCourses++;
		}
	}
	
	public void setCourseMark(int courseID, int mark) {
		for(Course thisCourse: courses) {
			if(thisCourse.CourseID == courseID)
				thisCourse.mark = mark;
		}
	}
	
	private double calculateAverageMark() {
		double averageMark = 0;
		int NoOfMarks = 0;
		for(Course thisCourse: courses) {
			if(thisCourse.mark != KEINENOTE) {
				averageMark += thisCourse.mark;
				NoOfMarks++;
			}
		}
		
		if(NoOfMarks == 0)
			return KEINENOTE;
		else
			return averageMark /= NoOfMarks;
	}
	
	public static Comparator<Student> getComparator() {
		Comparator<Student> comp = new Comparator<Student> () {
			@Override 
			public int compare(Student student1, Student student2) {
				// http://stackoverflow.com/questions/25015400/sort-set-in-java-using-comparator
				return Integer.compare(student1.getMatrikel(), student2.getMatrikel());
			}
		};
		return comp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + matrikel;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (matrikel != other.matrikel)
			return false;
		return true;
	}
	
	
}
