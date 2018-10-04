package lesson8;

public class User extends BaseEntity {

	String UserName;
	String location;

	public User(long id, String userName, String location) {
		super(id);
		UserName = userName;
		this.location = location;
	}

}
