package t_pack;

public class Node {
// attributes 
int value;
Node left;
Node right;
//default constructor 
public Node() {
	
}
//parameterized constructor
Node(int value, Node left, Node right) {
	super();
	this.value = value;
	this.left = left;
	this.right = right;
}
// setter and getters
int getValue() {
	return value;
}
void setValue(int value) {
	this.value = value;
}
Node getLeft() {
	return left;
}
void setLeft(Node left) {
	this.left = left;
}
Node getRight() {
	return right;
}
void setRight(Node right) {
	this.right = right;
}


}
