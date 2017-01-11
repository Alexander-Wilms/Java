import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Course myCourse1 = new Course(37, "Echtzeitprogrammierung", "Müller");
		System.out.println(myCourse1);
		
		Course myCourse2 = new Course(42, "Regelungstechnik", "Petersen");
		myCourse2.mark = 1;
		System.out.println(myCourse2);
		
		Student myStudent1 = new Student("Theurer", "Michael", 23864, 5);
		myStudent1.addCourse("Mathe für Anfänger", 1, "MatheProf");
		myStudent1.addCourse("Physik", 2, "PhysikProf");
		myStudent1.setCourseMark(2, 3);
		myStudent1.print();
		
		System.out.println(myStudent1);
		
		Student myStudent2 = new Student("Garvey" , "Timothy" , 23864+1, 5);
		
		Comparator myComparator = myStudent1.getComparator();
		
		
		System.out.println("myStudent1 < myStudent2: " + myComparator.compare(myStudent1, myStudent2));
		System.out.println("myStudent1 == myStudent2: " + myComparator.compare(myStudent1, myStudent1));
		System.out.println("myStudent2 > myStudent2: " + myComparator.compare(myStudent2, myStudent1));
		

	}

}
