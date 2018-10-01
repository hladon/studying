package lesson82;

public class CollegeStudent extends Student{
	String collegeName;
	int rating;
	long id;
	public CollegeStudent(String firstName, String lastName, int groupe, Course[] coursesTaken, String collegeName,
			int rating, long id) {
		super(firstName, lastName, groupe, coursesTaken);
		this.collegeName = collegeName;
		this.rating = rating;
		this.id = id;
	}
	public CollegeStudent(String firstName, String lastName, int groupe, Course[] coursesTaken) {
		super(firstName, lastName, groupe, coursesTaken);
	}
	// testing git hub with pushing
}
