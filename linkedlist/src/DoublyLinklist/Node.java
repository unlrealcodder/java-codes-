package DoublyLinklist;

public class Node {
int value;
Node pren;
Node next;

    public Node() {
		// TODO Auto-generated constructor stub
	}
// prev and next must be bydefault null
	Node(int value) {
		
		this.value = value;
		
	}

	int getValue() {
		return value;
	}

	void setValue(int value) {
		this.value = value;
	}

	Node getPren() {
		return pren;
	}

	void setPren(Node pren) {
		this.pren = pren;
	}

	Node getNext() {
		return next;
	}

	void setNext(Node next) {
		this.next = next;
	}
  
}
