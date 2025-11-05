package DeleteBegin;

public class Node {
    int data;
    Node next;

    public Node() { }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
        this(data, null);
    }

	int getData() {
		return data;
	}

	void setData(int data) {
		this.data = data;
	}

	Node getNext() {
		return next;
	}

	void setNext(Node next) {
		this.next = next;
	}

    // getters and setters...
}


