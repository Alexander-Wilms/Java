package javaexam2015;

public class CompulsaryOptionalCourse extends Course {

	public CompulsaryOptionalCourse(String name) {
		super(name);
	}
	
	@Override
	public String toString() {
		return super.toString() + " (WPF)";
	}

}
