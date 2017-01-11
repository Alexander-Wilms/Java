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
		
		Comparator<Student> myComparator = Student.getComparator();
		
		System.out.println("myStudent1 < myStudent2: " + myComparator.compare(myStudent1, myStudent2));
		System.out.println("myStudent1 == myStudent2: " + myComparator.compare(myStudent1, myStudent1));
		System.out.println("myStudent2 > myStudent2: " + myComparator.compare(myStudent2, myStudent1));
		
		Database myDatabase = new Database(4);
		myDatabase.addStudent(myStudent1);
		myDatabase.addStudent(myStudent2);
		
		Student myStudent3 = new Student("Franklin" , "Emma" , 23864-1, 5);
		myStudent3.addCourse("Mathematik", 42, "Frenzen");
		myDatabase.addStudent(myStudent3);
		
		myDatabase.print();
		
		myDatabase.sort();
		
		System.out.println("Ausgabe der sortierten Datenbank:");
		
		myDatabase.print();
		
		Database myDatabase2 = new Database(10);
		myDatabase2.addStudent(new Student("Mustermann", "Max", 100123, 5));
		myDatabase2.addStudent(new Student("Froehlich", "Fridolin", 100113, 5));
		myDatabase2.addStudent(new Student("Doesig","Dietmar",100144, 5));
		myDatabase2.addStudent(new Student("Fleiss","Felix",100763, 5));
		myDatabase2.addStudent(new Student("Hungrig","Henry",100100, 5));
		myDatabase2.addStudent(new Student("Wald","Waldemar",100, 5));
		myDatabase2.addStudent(new Student("Musterfrau","Maria",100122, 5));
		
		myDatabase2.print();
		
		myDatabase2.sort();
		
		System.out.println("Ausgabe der sortierten Datenbank:");
		
		myDatabase2.print();
		
		Database myDatabase3 = new Database(10);
		Student myStudent4 = new Student("Jackson", "Catherine", 666, 3);
		myStudent4.addCourse("Physik", 82823, "Prescott");
		myStudent4.addCourse("Elektronik", 4635, "Lecter");
		myStudent4.addCourse("Biologie", 49329, "Harris");
		myDatabase3.addStudent(myStudent4);
		
		Student myStudent5 = new Student("Humbert", "Brady", 42, 3);
		myStudent5.addCourse("Systemtheorie", 325415, "Kennedy");
		myStudent5.addCourse("Regelungstechnik", 92119, "Winthrop");
		myStudent5.addCourse("Echtzeitprogrammierung", 28572, "Chesley");
		myDatabase3.addStudent(myStudent5);
		
		Student myStudent6 = new Student("Irwin", "Glenda", 37, 3);
		myStudent6.addCourse("Echtzeitprogrammierung", 28572, "Chesley");
		myStudent6.addCourse("Systemtheorie", 325415, "Kennedy");
		myStudent6.addCourse("Elektronik", 4635, "Lecter");
		myDatabase3.addStudent(myStudent6);
		
		Student myStudent7 = new Student("Dylan", "Wendy", 4711, 3);
		myStudent7.addCourse("Physik", 82823, "Prescott");
		myStudent7.addCourse("Elektronik", 4635, "Lecter");
		myStudent7.addCourse("Biologie", 49329, "Harris");
		myDatabase3.addStudent(myStudent7);
		
		Student myStudent8 = new Student("Owen", "Chermaine", 815, 3);
		myStudent8.addCourse("Regelungstechnik", 92119, "Winthrop");
		myStudent8.addCourse("Echtzeitprogrammierung", 28572, "Chesley");
		myStudent8.addCourse("Biologie", 49329, "Harris");
		myDatabase3.addStudent(myStudent8);
		
		myDatabase3.print();
		
		myDatabase3.sort();
		
		System.out.println("Ausgabe der sortierten Datenbank:");
		
		myDatabase3.print();
	}

}
