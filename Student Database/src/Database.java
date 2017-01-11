import java.util.ArrayList;
import java.util.Comparator;

public class Database {
	private ArrayList<Student> Students;
	private int maxStudents;
	private int numberStudents;
	
	public Database(int maxStudents) {
		Students = new ArrayList<Student>();
		this.maxStudents = maxStudents;
		numberStudents = 0;
	}
	
	public void sort() {
		Comparator<Student> myComparator = Student.getComparator();
		Students.sort(myComparator);
	}

	public void print() {
		System.out.println("Database [Students=" + Students + ", maxStudents=" + maxStudents + ", numberStudents=" + numberStudents
				+ "]");
	}
	
	public boolean addStudent(Student student) {
		if(Students.size()+1 > maxStudents) {
			return false;
		} else {
			Students.add(student);
			numberStudents++;
			return true;
		}
	}
}
