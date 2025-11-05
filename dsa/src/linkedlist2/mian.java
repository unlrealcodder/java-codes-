package linkedlist2;

import java.util.Scanner;

import linkedlist.newlist;

public class mian {
    public static void main(String[] args) {
        newlist mylist = new newlist();
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            System.out.println("\n Doubly Linked List Menu ");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Display All Elements");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter element you want to insert at beginning: ");
                    int ele = sc.nextInt();
                    mylist.inserBeg(ele);
                    break;
                }
                case 2: {
                    mylist.displayAll();
                    break;
                }
                case 5: {
                    System.out.println("Exiting program. Bye!");
                    break;
                }
                default: {
                    System.out.println("Invalid choice! Please try again.");
                    break;
                }
            }
        }
        sc.close();
    }
}
