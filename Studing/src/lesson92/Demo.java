package lesson92;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User prob =new User(45,"Vasil","online");
		User[] arr = {new User(45,"Vasil","online"), new User(43,"Vova","online"),null ,new User(46,"Denis","online")};
		UserRepository uss=new UserRepository(arr);
		
		System.out.println(uss.save(prob));
		
	}

}
