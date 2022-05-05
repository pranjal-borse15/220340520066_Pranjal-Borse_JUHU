import java.util.*;


class InsertionSort{

	void insertionSort(int a[])
	{
		int n = a.length;
		for(int i=n-1;i>0;i--)
		{
			int k = a[i];
			int j=i-1;
			
			while(j>=0 && a[j]>k)
			{
				a[j+1]=a[j];
					j=j-1;
					for(int x :a)
					{
						System.out.print(x+" ");
					}
					System.out.println();
			}
			a[j+1]=k;
		}
		for(int x :a)
		{
			System.out.print(x+" ");
		}
					
	}
	
	public static void main(String args[])
	{
		InsertionSort i1 = new InsertionSort();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		
		i1.insertionSort(a);
	
	}
	
}
