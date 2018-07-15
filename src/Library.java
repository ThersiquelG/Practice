import java.util.HashMap;
public class Library {
	public Library () {
	}
	
	public void getFinishedBooks (HashMap<String, Boolean> library) {
	if (library.size() < 1) {
		System.out.println("Oh no, you can't have the HashMap empty");
		
	} else {
		for ( String book : library.keySet()) {
		if(library.get(book) == true ) {
			System.out.println(book + "\nThis book has been completed");
		}
		}
	}
	}
	
	public void getUnfinishinedBooks(HashMap<String, Boolean> library) {
		if(library.isEmpty() ) {
			System.out.println("Oh no, you can't have the HashMap empty");
			
		}
		for (String book : library.keySet() ) {
			if(!library.get(book)) {
				System.out.println("This book is not completed: " + book);
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Boolean> myBooks = new HashMap<String, Boolean>();
		myBooks.put("Road Down The Funnel", true);
		myBooks.put("Rat: A biology", false);
		myBooks.put("TimeIn", true);
		myBooks.put("3D Food Printing", false);
		
		Library myLibrary = new Library();
		myLibrary.getFinishedBooks(myBooks);
		myLibrary.getUnfinishinedBooks(myBooks);
		
	}

}
