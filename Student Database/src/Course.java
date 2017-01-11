
public class Course {
	
	public int mark;
	public String professor;
	public String name;
	public int CourseID;
	
	public static final int KEINENOTE = 99;
	
	public Course(int CourseID, String name, String professor) {
		this.CourseID = CourseID;
		this.name = name;
		this.professor = professor;
		
		this.mark = KEINENOTE;
	}

	@Override
	public String toString() {
		if (mark != KEINENOTE)
			return "Course [mark=" + mark + ", professor=" + professor + ", name=" + name + ", CourseID=" + CourseID + "]";
		else
			return "Course [mark=KEINENOTE" + ", professor=" + professor + ", name=" + name + ", CourseID=" + CourseID + "]";
	}


}
