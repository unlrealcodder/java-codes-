package linkedlist;

public class Node {
int value;//this cab replaced whichever data that need 
Node next;

//default constructor
public Node() {
	// TODO Auto-generated constructor stub
}
// parameterized constructor
public Node(int v1) {
	
	this.value = v1;
	
	
}
//setters and getters
public int getValue() {
	return value;
}

public void setValue(int value) {
	this.value = value;
}

public Node getNext() {
	return next;
}

public void setNext(Node next) {
	this.next = next;
}



}		
