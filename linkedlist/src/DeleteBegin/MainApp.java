package DeleteBegin;

public class MainApp {
    Node head;

    public static void main(String[] args) {
        MainApp app = new MainApp();

        Node n1 = new Node(89);
        Node n2 = new Node(67);
        Node n3 = new Node(80);

        app.insertLast(n1);
        app.insertLast(n2);
        app.insertLast(n3);
        app.deletebegin();
        app.iterate();  // instance method call
    }

    private void deletebegin() {
		// TODO Auto-generated method stub
		if(head==null)
		{
		    System.out.println("invalid ");
		}
		else
		{
			head=head.next;
		}
	}

	public void insertLast(Node newNode) {
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void iterate() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
