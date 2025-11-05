package classes;
class Books{
	String title;
	String author;
	boolean isAvailable=true;
	
	void borrowBook(){
		if(isAvailable) {
			isAvailable=false;
			System.out.println("book is borrowed successfully \n");
		}
		else {
			System.out.println("book is not available");
		}
	}
	
	void returnBook() {
		isAvailable=true;
		System.out.println("book return successfully");
	}
	
}

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Books b1=new Books();
		b1.title="atomic habit";
		b1.author="james clear";
		
		b1.borrowBook();
		b1.borrowBook();
		b1.returnBook();
	
	}

}
