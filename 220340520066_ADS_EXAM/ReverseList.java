import java.util.*;


class ReverseList{

	Node head;
	Node tail;
	
	class Node{
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	
	void addNode(int d)
	{
		Node n = new Node(d);
		if(head==null)
		{
			head=n;
			tail=n;
		}
		else
		{
			tail.next = n;
			tail=n;
		}
	}
	
	
	void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	
	void reverselist()
	{
		Node prev = null;
		Node curr = head;
		if(curr==null)
			return;
		while(curr!=null){
				Node next = curr.next;
				curr.next=prev;
				prev=curr;
				curr=next;
		}
		head.next=null;
		head=prev;
	}
		
	public static void main(String arga[])
	{
		
		ReverseList r = new ReverseList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n = sc.nextInt();
		
		System.out.println("Enter the elements");
		for(int i=1;i<=n;i++)
		{
			int x = sc.nextInt();
			
				r.addNode(x);
			
		}
		
		r.display();
		
		System.out.println("Reverse list is");
		
		r.reverselist();
		
		r.display();
		
		
	
	}
}
	