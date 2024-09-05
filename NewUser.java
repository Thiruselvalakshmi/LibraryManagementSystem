package library;
import java.util.*;
public class NewUser {
	
	static List<String> name = new LinkedList<>();
	static List<Long> phno = new LinkedList<>();
	static List<String> userid = new LinkedList<>();
	static List<Integer> bookscnt = new LinkedList<>();
	
	static String id = "";
	static int cnt = 0;
	
	public static void newUser(String name,long phno) {
		NewUser.name.add(name);
		NewUser.phno.add(phno);
		id = "" + ((char)name.charAt(0)) + cnt++ ;
		NewUser.userid.add(id);
		NewUser.bookscnt.add(5);
		
		System.out.println("Congrats! "+name+" your account is created successfully!!!");
		System.out.println("Your UserId is "+id);
		System.out.println("Happy Learning...");
	}

}
