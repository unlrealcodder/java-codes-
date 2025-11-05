package DoublyLinklist;

public class DoublyLinklist {

	Node head;
	
	public void InsertBegin(int ele)
	{
		Node temp=new Node(ele);
		// "this" is used because object of class doublylinklist will 
		// call the head
		if(this.head==null)// for empty linklist
		{
			head=temp;
		}
		else // for nonempty linklist
		{
			temp.next=this.head;
			head.pren=temp;
			this.head=temp;
		}
		System.out.println("--- Data added ---");
	}// function ends here
	
	public void DisplayAll()
	{
		if(head==null)
		{
			System.out.println("--- No data to display ---");
		}
		else
		{
		Node current=head;
		while(current.next != null)
		{
			System.out.print(current.value+"->");
			current=current.next;
		}
		System.out.println(current.value+ " -> ");// for last node element
		} 
	}
}
