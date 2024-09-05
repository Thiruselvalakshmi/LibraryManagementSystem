package library;

public class BorrowBook {

	public static boolean isAvailable(int id) {
		for(int i=0;i<BookList.bid.size();i++) {
			if(BookList.bid.get(i) == id) {
				if(BookList.copy.get(i) > 0)
					return true;
				else
					return false;
			}				
		}
		return false;
	}
	
	public static boolean isEligible(String uid) {
		for(int i=0;i<NewUser.userid.size();i++) {
			if(NewUser.userid.get(i).equals(uid)) {
				if(NewUser.bookscnt.get(i) > 0)
					return true;
				else {
					System.out.println("Your borrowed books count exceeded 5\nSo now you cannot borrow the book...");
					return false;
				}
			}
		}
		System.out.println("Invalid user id.");
		return false;
	}
	
	public static void borrow(int id, String uid) {
		if(!(isAvailable(id)))
			System.out.println("Sorry the copy of the book you requested is not available now....");
		else {
			if(!(isEligible(uid))) {
				System.out.println("Borrow Book failed..");
			}
			else {
				for(int i=0;i<BookList.bid.size();i++) {
					if(BookList.bid.get(i) == id) {
						int cpy = BookList.copy.get(i);
						cpy -= 1;
						BookList.copy.set(i, cpy);
						System.out.println("Book borrowed successfully");
						break;
					}
				}
				for(int i=0;i<NewUser.userid.size();i++) {
					if(NewUser.userid.get(i).equals(uid)) {
						int cpy = NewUser.bookscnt.get(i);
						cpy -= 1;
						NewUser.bookscnt.set(i,cpy);
						break;
					}
					
				}
			}
		}
	}
	
}
