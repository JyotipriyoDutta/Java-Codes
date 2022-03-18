import java.util.*;
public class Majority_Element_1 
{
	public static void main(String args[])
	{
		Scanner in=new Scanner (System.in);
		HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
		int c=0,i,j;
		System.out.println("Enter the size of the array");
		int n=in.nextInt();
		int a[]=new int[n];
		for (i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.println("Enter the value of k");
		int k=in.nextInt();
		for (i=0;i<n;i++)
		{
			if (!mp.containsKey(a[i]))
				mp.put(a[i],1);
			else
			{
				c=mp.get(a[i]);
				mp.put(a[i],c+1);
			}
		}
		
		for ( Integer num : mp.keySet())
		{
			if (mp.get(num)>(n/k))
				System.out.println (num);
		}
		
	}
}
