package library;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("***********************");
		System.out.println("--------WELCOME--------");
		System.out.println("***********************");
		boolean flag = true;
		
		while(flag) {
			System.out.println("1. Display Book Details\n2. New User Account Creation\n3. Borrow Book\n4.Exit");
			System.out.println("Enter your choice : ");
			int ch = s.nextInt();
			
			switch(ch) {
			case 1:{
				BookList bl = new BookList();
				bl.displayBook();
				break;
			}
			case 2:{
				System.out.println("New User Creation");
				System.out.println("Enter your Name : ");
				String name = s.next();
				System.out.println("Enter your Phone Number : ");
				long ph = s.nextLong();
				NewUser.newUser(name, ph);
				break;
			}
			case 3:{
				System.out.println("Borrow Book");
				System.out.println("Enter the book id : ");
				int id = s.nextInt();
				System.out.println("Enter your user id :");
				String uid = s.next();
				BorrowBook.borrow(id, uid);
				break;
			}
			
			case 4:{
				System.out.println("Thank You!!!!");
				flag = false;
				break;
			}
			}
		}
		s.close();
	}
}
