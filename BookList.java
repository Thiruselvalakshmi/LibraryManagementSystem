package library;
import java.util.*;
public class BookList {
	
	static List<String> bname = new LinkedList<>();
	static List<Integer> bid = new LinkedList<>();
	static List<String> bauthor = new LinkedList<>();
	static List<Integer> edition = new LinkedList<>();
	static List<Integer> copy = new LinkedList<>();
	
	static {
	bname.add("ABC");
	bname.add("DEF");
	bname.add("GHI");
	bname.add("JKL");
	
	bid.add(1);
	bid.add(2);
	bid.add(3);
	bid.add(4);
	
	bauthor.add("ZYX");
	bauthor.add("WVU");
	bauthor.add("RST");
	bauthor.add("OPQ");
	
	edition.add(22);
	edition.add(10);
	edition.add(5);
	edition.add(8);
	
	copy.add(5);
	copy.add(5);
	copy.add(5);
	copy.add(5);
	}
	
	public void displayBook() {
		System.out.println("BOOK DETAILS");
		System.out.println("BID\tNAME\tAUTHOR\tEDITION\tAVAILABLE COPY");
		for(int i=0;i<bid.size();i++) 
			System.out.print("  "+bid.get(i)+"\t"+bname.get(i)+"\t"+bauthor.get(i)+"\t"+edition.get(i)+"\t    "+copy.get(i)+"\n");
		
	}
	

}
