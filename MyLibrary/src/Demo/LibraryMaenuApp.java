package Demo;
import java.util.*;

abstract class Book{
	private static int idCounter=1000;
	private int BookId;
	private String title;
	private boolean isAvailable;
	
	
	Book(String title, boolean isAvailable) {
		super();
		this.BookId = BookId;
		this.title = title;
		this.isAvailable = isAvailable;
	}
	
	public int getBookId() {
		return BookId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public boolean isAvailable() {
		return isAvailable;
	}
	
	
	public abstract void displayInfo();
	
}// class book ends


class FictionBook extends Book{

	private String genre;

	FictionBook( String title, boolean isAvailable,String genre) {
		super(title, isAvailable);
		this.genre=genre;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("fiction book - id "+getBookId()+",titlte:"+getTitle()+",genre"+genre+",available"+isAvailable());
		
	}

	
	
	
	
}

public class LibraryMaenuApp {

	public static void main(String[] args) {
		List<Book>library=new ArrayList();
		library.add(new FictionBook("atomic habit",true,"classic"));
		 for(Book book:library)
		 {
			 book.displayInfo();
		 }
		
		// TODO Auto-generated method stub

	}

}
