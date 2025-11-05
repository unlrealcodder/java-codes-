package DoublyLinklist;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// menu driven code 
		DoublyLinklist mylist = new DoublyLinklist();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		while(choice!=5)
		{
			System.out.println("\t 1.insert begining");
			System.out.println("\t 2.display all");
			System.out.println("\t 5.Enter your choice  ");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
			{
				int ele;
				System.out.println("enter element do you want to insert at begining: \n ");
				ele=sc.nextInt();
				mylist.InsertBegin(ele);
				break;
			}
			
			case 2:
			{
				mylist.DisplayAll();
				break;
			}
			
			case 5:
			{
				System.out.println("--- Bye Bye ---");
				break;
			}
			 default:
			 {
				 System.out.println("--- Invalide choice ---");
				 break;
			 }
			}
		}

	}

}
