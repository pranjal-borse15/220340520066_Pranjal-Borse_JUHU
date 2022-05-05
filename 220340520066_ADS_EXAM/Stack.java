class Stack{
	
		int top1;
		int max_size;
		int a[];
		int top2;
	
		Stack(int n)
		{
			top1=-1;
			
			max_size = n;
			top2=max_size;
			a=new int[max_size];
		}
		
		boolean isEmpty()
		{
			if(top1==-1 && top2==max_size)
			{
				return true;
			}
			return false;
		}
		
		boolean isFull()
		{
			if(top1==max_size-1)
			{
				return true;
			}
			return false;
		}
		
		
		void push1(int d)
		{
			if(isFull())
			{
				System.out.println("Stack is full");
			}
			else
			{
				top1 = top1+1;
				a[top1]=d;
			}
		}
		
		void pop1()
		{
			if(isEmpty())
			{
				System.out.println("Stack is Empty");
			}
			else
			{
				int x = a[top1];
				top1--;
				System.out.println("Popped element from stack1 is "+x);
			}
		}
		
		void push2(int d)
		{
			if(isFull())
			{
				System.out.println("Stack is Full");
			}
			else
			{
				top2=top2-1;
				a[top2]=d;
			}
		}
		
		void pop2()
		{
			if(isEmpty())
			{
				System.out.println("Stack is Empty");
			}
			else
			{
				int x = a[top2];
				top2--;
				System.out.println("Popped element from stack2 is "+x);
			}
		}
		
	public static void main(String args[])
	{
		Stack s = new Stack(10);
		s.push1(5);
		s.push2(10);
		s.push2(15);
		s.push1(11); 
		s.push2(7); 
		s.push2(40);
		s.pop1();
		s.pop2();
		//s.display();
		
	
	}
}