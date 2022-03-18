import java.util.*;
public class Majority_Element 
{
	public static void main(String args[])
	{
		Scanner in=new Scanner (System.in);
		int c=0,i,j;
		System.out.println("Enter the size of the array");
		int n=in.nextInt();
		int a[]=new int[n];
		for (i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for (i=0;i<n;i++)
		{
			c=0;
			for (j=i+1;j<n;j++)
			{
				if (a[i]==a[j])
					c++;
			}
			if ((c+1)>(n/3))
				System.out.println(a[i]);
		}
	}
}
