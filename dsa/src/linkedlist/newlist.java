package linkedlist;



public class newlist {
	Node head;
	
	public void inserBeg(int ele) {
		Node temp = new Node(ele);
		if (this.head==null) {
			this.head=temp;
			
		}
		else {
			
			temp.next = this.head;
			head.prev = temp;
			this.head = temp;
		}
		System.out.println("data added");
	}
	public void displayAll() {
		if(head==null) {
			System.out.println(" no data");
		}else {
			Node p = this.head;
			while(p.next != null) {
				System.out.print(p.data+"->");
				
			p=p.next;
			}
			System.out.print(p.data+" -> ");
					
		}
	}

}