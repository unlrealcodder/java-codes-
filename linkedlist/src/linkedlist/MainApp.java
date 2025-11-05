package linkedlist;

public class MainApp {
	Node head;//head is global
	int count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Node n1=new Node(23);
        Node n2=new Node(33);
        Node n3=new Node(20);
        Node n4=new Node(99);
        Node n5=new Node(100);
        MainApp app =new MainApp();
        app.InsertLast(n1);
        app.InsertLast(n2);
        app.InsertLast(n3);
        
        app.insertposition(2,n4);  
        app.InsertBegin(n5);
        app.iterate();
        
     
        

	}
	
	// used to print
	private void iterate()
	{
		
	  Node current =head;
		while(current!=null)
		{	
			System.out.println(current.value);
			current=current.next;
		}
	
	}
	
public void InsertLast(Node v1)
{  
	if(head==null)
	{
		head=v1;
	}
	else
	{
		//find the last element
		Node current=head;
		while(current.next!=null)
		{
		   current=current.next;
		}
		
		current.next=v1;
	}
}




public void insertposition(int position,Node newNode)
{
	if(position==0)
	{
		newNode.next=head;
		head =newNode;
		return;
	}
	
	Node current =head;
    int count=0;
	while(count<position-1)
	{
		current=current.next;
		count++;
	}
	newNode.next=current.next;
	current.next=newNode;
	
}

public void InsertBegin(Node newNode2)
{
	if(head==null)
	{
		
		head=newNode2;
		
	}
	
	
	else
	{
	    newNode2.next=head;
	    head=newNode2;
	}
	
}



}
