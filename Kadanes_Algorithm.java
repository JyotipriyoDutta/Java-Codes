import java.util.*;
public class Kadanes_Algorithm 
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=in.nextInt();
		int a[]=new int[n];
		int i,max_here=0,max_sofar=0,start=0,end=0;
		for (i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for (i=0;i<n;i++)
		{
			max_here+=a[i];
			if (max_here>max_sofar)
			{
				max_sofar=max_here;
				end=i;
			}
			if (max_here<0)
			{
				max_here=0;
				start=i+1;
			}
		}
		for (i=start;i<=end;i++)
		{
			System.out.print(a[i]+"  ");
		}
		System.out.println();
		System.out.println(max_sofar);
	}
}
//Second Commit