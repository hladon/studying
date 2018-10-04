package lesson11hw;

import java.util.*;
public class Demo {

	public static void main(String[] args) {
		Room[] booking ={new Room(1, 50, 2,new Date(), "Kiev", "hilton"),new Room(2, 70, 4,new Date(), "Kiev", "hilton"),new Room(3, 50, 2,new Date(), "Kiev", "hilton")};
		Room[] trip ={new Room(4, 40, 2,new Date(), "lvov", "hilton"),new Room(5, 70, 4,new Date(), "lvov", "hilton"),new Room(6, 50, 2,new Date(), "lvov", "hilton")};
		Room[] rooms ={new Room(7, 150, 2,new Date(), "lvov", "hilton"),new Room(8, 40, 2,new Date(), "lvov", "hilton"),new Room(9, 40, 2,new Date(), "lvov", "hilton")};
		API[] apis= {new BookingComAPI(booking),new TripAdvisorAPI(trip), new GoogleAPI(rooms)};
		
		Controller cont=new Controller(apis);
		GoogleAPI cont2=new GoogleAPI(rooms);
		BookingComAPI cont3=new BookingComAPI(rooms);
		Room[] test=cont.check(new GoogleAPI(rooms), new BookingComAPI(rooms));
		int price=40;
		int persons=2;
		String city= "hilton";
		String hotel= "lvov";
		System.out.println(test.length);
		for (int index=0; index<test.length; index++){
				if (test[index]!=null){
				System.out.println(test[index].getId());}
				}
			
		
		
		
	}

}
