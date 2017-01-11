
public class Main {

	public static void main(String[] args) {
		Course myCourse1 = new Course(37, "Echtzeitprogrammierung", "Müller");
		System.out.println(myCourse1);
		
		Course myCourse2 = new Course(42, "Regelungstechnik", "Petersen");
		myCourse2.mark = 1;
		System.out.println(myCourse2);

	}

}
