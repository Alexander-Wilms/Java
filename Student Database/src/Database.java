import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;

public class Database {
	private HashMap<Integer, Student> Students;
	private int maxStudents;
	private int numberStudents;
	
	public Database(int maxStudents) {
		Students = new HashMap<Integer, Student>();
		this.maxStudents = maxStudents;
		numberStudents = 0;
	}

	public void print() {
		System.out.println("Database [Students=" + Students + ", maxStudents=" + maxStudents + ", numberStudents=" + numberStudents
				+ "]");
	}
	
	public boolean addStudent(Student student) {
		if(Students.size()+1 > maxStudents) {
			return false;
		} else {
			Students.put(student.getMatrikel(), new Student(student));
			numberStudents++;
			return true;
		}
	}
	
	public Student findStudent(int matrikel) {
		return Students.get(matrikel);
	}
	
	public void printByName() {
		Collection<Student> mySet = Students.values();
		Comparator<Student> myNameComparator = Student.getNameComparator();
		
		ArrayList<Student> myArrayList = new ArrayList<Student>();
		myArrayList.addAll(mySet);
		
		myArrayList.sort(myNameComparator);
		
		for(Object student : myArrayList) {
			Student thisstudent = (Student) student;
			thisstudent.print();
		}
	}
	
	public void printByMatrikel() {
		Collection<Student> mySet = Students.values();
		Comparator<Student> myMatrikelComparator = Student.getMatrikelComparator();
		
		ArrayList<Student> myArrayList = new ArrayList<Student>();
		myArrayList.addAll(mySet);
		
		myArrayList.sort(myMatrikelComparator);
		
		for(Object student : myArrayList) {
			Student thisstudent = (Student) student;
			thisstudent.print();
		}
	}
}
