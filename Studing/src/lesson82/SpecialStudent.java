package lesson82;

public class SpecialStudent extends CollegeStudent {
	long secretKey;
	String email;
	public SpecialStudent(String firstName, String lastName, int groupe, Course[] coursesTaken,  long secretKey, String email) {
		super(firstName, lastName, groupe, coursesTaken );
		this.secretKey = secretKey;
		this.email = email;
	}
	
}
